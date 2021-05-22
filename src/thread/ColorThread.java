package thread;

import model.Line;

public class ColorThread extends Thread {

    private final Line line;
    private final int speed;

    public ColorThread(int speed, String color, int startingRow, int height, int width) {
        this.speed = speed;
        line = new Line(color, startingRow, height, width);
    }

    @Override
    public void run() {
        int startingRow = line.getStartingRow();
        int height = line.getHeight();
        int width = line.getWidth();

        for(int x = 1; x<=width; x++) {
            for(int y = startingRow; y<startingRow+height; y++) {
                line.printColor(x, y);
                try {
                    sleep(speed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

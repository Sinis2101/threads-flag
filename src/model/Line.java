package model;

public class Line {

    public final static String ESC = "\u001b[";

    private final String color;
    private final int startingRow;
    private final int height;
    private final int width;

    public Line(String color, int startingRow, int height, int width) {
        this.color = color;
        this.startingRow = startingRow;
        this.height = height;
        this.width = width;
    }

    public void printColor(int x, int y) {
        System.out.print(ESC + x + "G" + ESC + y + "d" + color + " " + "\u001B[0m");
    }

    public int getStartingRow() {
        return startingRow;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

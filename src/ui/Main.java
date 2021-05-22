package ui;

import thread.ColorThread;

public class Main {

    public final static String YELLOW = "\033[43m";
    public final static String BLUE = "\033[46m";
    public final static String RED = "\033[41m";

    public static void main(String[] args) throws InterruptedException {

        ColorThread yellowThread = new ColorThread(5, YELLOW, 1, 10, 100);
        ColorThread blueThread = new ColorThread(15, BLUE, 11, 5, 100);
        ColorThread redThread = new ColorThread(30, RED, 16, 5, 100);

        yellowThread.start();
        blueThread.start();
        redThread.start();

    }
}

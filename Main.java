import java.util.Scanner;
import java.io.*;
import java.swing.*;

public class Main{
    static boolean running = true;
    static int loops = 0; //times mainLoop has looped

    static double[] versions = []{0.0, 0.1}
    static double version = 0.1;

    static String userName;

    

    Scanner input = new Scanner(System.in);

    /**
     * This sets up the window and shows it.
     */
    public void windowSetup() {
        JFrame frame = new JFrame("Meow");
        JLabel label1 = new JLabel("I love skibidi toilet");

        for (int versionIterator : versions) {
            if (versionIterator == version) {
                if (version == 0.0) {
                    System.out.println("There's nothing here.")
                } else if (version == 0.1) {
                    System.out.printf("Verion: %d\n", version);

                    frame.add(label1);

                    frame.setSize(500,500);
                    frame.isResizeable(false);

                    frame.isAlwaysOnTop(false);
                    frame.show();
                } else {
                    running = false;
                }
                
            } else {
                System.out.printf("%d is not a valid version.\n", version);
                running = false;
            }
        }
        
    }

    /**
     * This is the main loop that the program runs on.
     * Each time the loop is complete, a variable called loops is incremented by one point.
     * If the mainLoop has looped more than 1000 times, the running boolean will be set to false.
     * The mainLoop will stop.
     */
    public void mainLoop() {
        while (running) {
            System.out.printf("loop #%i\n", loops);

            if (loops >= 1000) {
                loops ++;
            } else {
                running = false;
            }
    }
    

    public static void(Main(String args[])) {
        windowSetup();
        mainLoop();
    }
}
import java.util.Scanner;
import java.io.*;
import java.swing.*;

public class Main{
    static boolean running = true;
    static int loops = 0; //times mainLoop has looped

    static double = version;
    static String userName;

    Scanner input = new Scanner(System.in);

    /**
     * This sets up the window and shows it.
     */
    public void windowSetup() {
        JFrame frame = new JFrame("Meow");
        JLabel label1 = new JLabel("I love skibidi toilet");

        System.out.printf("Verion: %d", version);

        frame.add(label1);

        frame.setSize(500,500);
        frame.show();
    }

    /**
     * This is the main loop that the program runs on.
     */
    public void mainLoop() {
        while (running) {
            System.out.prinf("loop #%i", loops);
            loops ++;
        }
    }
    

    public static void(Main(String args[])) {
        windowSetup();
        mainLoop();
    }
}
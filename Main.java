import java.util.Scanner;

public class Main {
    public static boolean isRunning = false;
    public static boolean isLoggedIn = false;

    public static int loops = 0;

    public static void init() {

    }

    public static void mainLoop() {
        if (isRunning) {
            while (isRunning) {

                loops += 1;
            }
        } else {
            System.out.println("Cannot start mainLoop without initializing")
        }
    }
    public static void main(String args[]) {
        init();
        mainLoop();
    }
}
public class Animal{
    private static boolean alive = true;

    private static String name;
    private static int age;

    private static int fullness = 100; //each action degrades hunger. If the animal's hunger reaches 0, the animal dies.
    private static int energy = 100; //each action degrades energy. If the animal's energy reaches 0, the animal cannot do anything until it rests.

    /**
     * Makes sure conditions for life are met. If they are not, this will kill the animal.
     */
    public static killer() {
        if (fullness <= 0) {
            alive = false;
        }
    }

    public static rename(String newName) {
        if (alive) {
            name = newName;
        
            fullness -= 1;
            energy -= 1;
            killer();
        } else {
            System.out.println("This animal is dead.");
        }
    }

    public static feed() {
        if (alive) {
            fullness += 5;
            energy -= 3;
            killer();
        } else {
            System.out.println("This animal is dead.");
        }
        
    }

    public static rest(int hours) {
        if (alive) {
            if (hours <= 12) {
            fullness -= 2 * hours;
            energy += 5 * hours;
            killer();
            } else {
                System.out.println("Maximum rest time is 12 hours. Try again.");
        } else {
            System.out.println("This animal is dead.");
        }
        
        }
    } 
    
    public static Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}










/*
if (alive) {

        } else {
            System.out.println("This animal is dead.")
        }


*/
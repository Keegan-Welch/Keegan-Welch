public class Person {
    private static String firstName;
    private static String lastName;
    private static String fullName;

    private static int age;
    private static Animal pet; 

    private static boolean alive = true;
    private static boolean awake = true;

    private static int fullness = 100;
    private static int hunger = 100;
    
    public static void fullnessUpdate() {
        if (alive) {
            if (fullness <= 0) {
                alive = false;
            } else {
                fulleness -= 1;
            }
        } else {
            System.out.printf("%s is dead. \n", firstName);
        }
    }

    public static void energyUpdate() {
        if (alive) {
            if (energy <= 0) {
                awake = false;
            } else {
                energy -= 1;
            }
        } else {
            System.out.printf("%s is dead. \n", firstName);
        }
    }
    public static void turnPass() {
        if (alive) {
            if (asleep) {
                fullnessUpdate();
                energy += 3;
                if (energy >= 10) {
                    awake = true;
                }
            } else {
                fullnessUpdate();
                System.out.println("fullness: " + fulleness);
                energyUpdate();
                System.out.println("energy: " + energy);
            }
        } else {
            System.out.printf("%s is dead. \n", firstName);
        }
    }

    public static void Person(String firstName, String lastName, int age, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.age = age;
        this.pet = pet;
        System.out.printf("IMPORTANT NOTICE: Keep %s's hunger above 0 or else they will die!", firstName);
    }
}
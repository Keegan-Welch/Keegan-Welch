public class Animal{
    private static String name;
    private static int age;

    public static rename(String newName) {
        name = newName;
    }
    
    public static Animal(String name, int age) {
        this.name = name;
        this.age = age
    }
}
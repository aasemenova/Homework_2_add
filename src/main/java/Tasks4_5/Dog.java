package Tasks4_5;

public class Dog implements Runnable {
    public void run() {
        System.out.println("Собачка бежит!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
    }
}
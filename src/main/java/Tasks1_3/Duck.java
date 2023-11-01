package Tasks1_3;

public class Duck extends Animal {
    private int age = 3;

    @Override
    public void move() {
        System.out.println("Я полетела");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
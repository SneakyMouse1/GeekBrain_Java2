package lesson1;

public abstract class Animal {
    String name;
    static final String COUNTRY = "Russia";

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void print() {
        System.out.println("Животное издаёт звук");
    }

    public final void swim() {
        System.out.println("Животное плавает");
    }

    public abstract void voice();
}
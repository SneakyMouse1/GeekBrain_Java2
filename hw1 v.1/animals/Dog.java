package lesson1;

public class Dog extends Animal {
//    public Dog(String name) {
//        super(name);
//        super.name = "123";
//    }

    public void print() {
        System.out.println("Dog print");
    }

//    @Override
//    public void swim() {
//        System.out.println("Собака плавает");
//    }

    @Override
    public void voice() {
        System.out.println("Dog bark");
    }
}

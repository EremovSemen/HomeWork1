package Lesson6;

public class Cat extends Animal {


    public Cat(String type, String name) {
        super(type, name);
    }

    @Override
    public void swim(int a) {
        System.out.println("Кот может проплыть: " + a + " Метров");
    }

    @Override
    public void run(int a) {
        System.out.println("Кот может пробжать: " + a + " Метров");
    }
}

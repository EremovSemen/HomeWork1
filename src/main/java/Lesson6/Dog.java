package Lesson6;

public class Dog extends Animal {


    public Dog(String type, String name) {
        super(type, name);
    }

    @Override
    public void swim(int a) {
        System.out.println("Пёс может проплыть: " + a + " Метров");
    }

    @Override
    public void run(int a) {
        System.out.println("Пёс может пробжать: " + a + " Метров");
    }
}

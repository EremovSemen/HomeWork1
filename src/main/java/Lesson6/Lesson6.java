package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        int Cats = 0;
        int Dogs = 0;

        Cat cat = new Cat("Кот", "Мурзик");
        Dog dog = new Dog("Пёс","Бобик");
        dog.swim(10);
        dog.run(500);
        cat.run(200);
        cat.swim(0);
        Animal[] animals = new Animal[] {
                new Cat("Кот", "Мурзик"),
                new Cat("Кот", "Барсик"),
                new Dog("Пёс","Бобик")
        };
        for (Animal animal : animals) {
           if( animal.getType() == "Кот") {
               Cats += 1;
           }
           else {
               Dogs +=  1;
           }
        }
        System.out.println();
        System.out.println("Кольчество Котов: " + Cats);
        System.out.println("Кольчество Собак: " + Dogs);




    }
}

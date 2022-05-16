package HM7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 50, false);
        Cat cat2 = new Cat ("Мурзик",51, false);
        Plate plate = new Plate(100);
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();
        System.out.println(cat1);
        System.out.println(cat2);
        plate.replenishment(100);
        plate.info();
        catInfo();

    }
    public static void catInfo() {
        Plate plate = new Plate(100);
        Cat cat = new Cat();
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Пушистик", 15, false);
        cats[1] =new Cat("Боря", 20, false);
        cats[2] =new Cat("Годзилла", 40, false);
        cats[3] =new Cat("Аркаша", 26, false);
        cats[4] =new Cat("Геша", 5, false);
         for (int i = 0; i < cats.length; i++) {
             plate.info();
             cats[i].eat(plate);
             plate.info();
            System.out.println(cats[i]);
        }
    }
}
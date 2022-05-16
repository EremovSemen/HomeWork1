package HM7;

public class Plate {
    Cat cat = new Cat();

    private int food;

    public Plate() {
    }

    public Plate(int food) {
            this.food = food;
        }
        public void decreaseFood(int n) {
            food -= n;
        }
        public void info() {
            if (cat.getAppetite() >= getFood()) {
                food = 0;
                System.out.println("Недостаточно еды");
            }
            System.out.println("plate: " + food);
        }
        public int replenishment(int a) {
        if ( food == 0) {
            food += a;
            System.out.println("Тарелка пополнена");
        }
        return a;
        }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    }





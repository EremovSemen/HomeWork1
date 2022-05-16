package HM7;

public class Cat {


    private String name;
    private int appetite;
    private boolean satiety;
    public Cat() {
    }
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        if (appetite < p.getFood()) {
            satiety = true;
            System.out.println(name + " Хорошо покушал)");
        }
        if (appetite > p.getFood()) {
            System.out.println(name + " Ненаiвся...");
        }
        p.decreaseFood(appetite);
        }


    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public boolean isSatiety() {


        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}

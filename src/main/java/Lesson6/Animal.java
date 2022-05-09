package Lesson6;

public  abstract class Animal {



    private String Type;
    private String Name;

    public Animal(String type, String name) {
        Type = type;
        Name = name;
    }


    public abstract void swim(int a);
    public abstract void run(int a);

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }




}

package HomeWork2;

import java.util.Arrays;

public class Colleague {


    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private int telephone;
    private String wages;
    private int age;

    public Colleague (String name, String surname, String patronymic, String position, String email, int telephone, String wages, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wages = wages;
        this.age = age;


    }

    public static void main(String[] args) {
        Colleague colleague1 = new Colleague("Иван", "Иванов", "Ианович", " Продавец", "iv@mail.ru", 5565534, "1000$", 44);

        System.out.println("Фамилия, Имя, Отчество сотрудника: " + colleague1.getSurname() + " " + colleague1.getName() + " " + colleague1.getPatronymic());
        System.out.println("Должность: " + colleague1.getPosition());
        System.out.println("Электронная почта: " + colleague1.getEmail());
        System.out.println("Телефон: "  + colleague1.getTelephone());
        System.out.println("Размер заработной платы: " + colleague1.getWages());
        System.out.println("Возраст: " + colleague1.getAge());
        System.out.println();
        System.out.println("Сотрудники страше 40-ка лет: ");
        informationOfAge();
        System.out.println();
    }
    public static void informationOfAge(){
        Colleague[] arr =new Colleague[5];
        arr[0] = new Colleague("Иван", "Иванов", "Ианович", " Продавец", "iv@mail.ru", 5555534, "1000$", 44);
        arr[1] = new Colleague("Александр", "Панов", "Викторович", "Грузчик", "iке@mail.ru", 5785534, "556$", 40);
        arr[2] = new Colleague("Ваня", "Штанов", "Аркадьевич", "Токарь", "iсс@mail.ru", 5559534, "900$", 14);
        arr[3] = new Colleague("Алексей", "Занов", "Алексеевич", "Слесарь", "i56@mail.ru", 5576534, "999$", 39);
        arr[4] = new Colleague("Егор", "Вованов", "Владимирович", "Собутыльник", "ува@mail.ru", 6655534, "1007$", 45);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() >= 40) {
                System.out.println(arr[i]);
            }
        }
    }
    public String toString () {
        return surname + " " + name + " " + patronymic + ", " + position + " " + email + " " + telephone + " " + wages + " " + age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        if (age >= 0 && age < 150) {
            age = age1;
        }
    }
}

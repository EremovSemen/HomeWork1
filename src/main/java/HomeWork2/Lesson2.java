package HomeWork2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(Task1(1,2));
        Task2(0);
        System.out.println(Task3(3));
        Task4();
        System.out.println(Task5(-4));
    }

    public static boolean Task1(int a, int b) {
        if (a + b < 10 || a + b > 20) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void Task2(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean Task3 (int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void Task4() {
        String a = "Hello World!";
        int b = 5;
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean Task5(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

package Lesson3;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(10,5);
        task6();
        int [] array = {1,2,3,4,5,6,8};
        System.out.println(task7(array));
        task8(array,10);
        System.out.println(Arrays.toString(array));
    }

    public static void task1() {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task2() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i == j ) {
                    arr[i][j] = 1;
                }
                else if ( (i + j)  == 4) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] task5(int len, int initialValue ) {
        int[] arr =new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
            System.out.println(Arrays.toString(arr));
       return arr;
    }
    public static void task6() {
        int[] arr = {1,66,3,4,44,6,-7,8,9,10};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if ( arr[i] <= min) {
                min = arr[i];
            }
        }
            System.out.print(max+ " " + min);
        System.out.println();
    }
    public static boolean task7 (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i]) {
                sum += array[i];
            }
        }
        if (sum % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void task8(int[] array, int n) {
        int a = 0;
        int b = 0;
        if ( n > 0) {
            for (int i = 0; i < n; i++) {
                a = array[array.length -1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = a;
            }
            }
        if (n < 0) {
            for (int i = array.length; i > n ; i--) {
                b = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length-1] = b;

            }
        }
        }

    }









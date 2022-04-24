package Game;

import java.util.Random;
import java.util.Scanner;

public class CrossesAndZeros {


    private static int x, y;
    private static final char DOT_0 = '0';
    private static final char DOT_X = 'x';
    private static final char DOT_TO_WIN = 3;
    private static final char DOT_IS_EMPTY = '*';
    private static final char SIZE = 3;
    private static char[][] map;
    static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_IS_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        do {
            System.out.println("Ваш ход. Введите значение Х и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_IS_EMPTY) return true;
        if (map[x][y] == DOT_0 || map[x][y] == DOT_X) return false; // в методичке эта проверка отсутствовала
        return false;
    }

    public static void aiTurn() {
        do {
            aiHard2X(x);
            aiHardY2(y);
        } while (!isCellValid(x, y));
        System.out.println("Ход компьютера: " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_IS_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {

        for (int i = 0; i < SIZE; i++) {
            int sum = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) sum++;
            }
            if (sum == DOT_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            int sum = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) sum++;
            }
            if (sum == DOT_TO_WIN) {
                return true;
            }
        }
        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && map[i][j] == symb) sum++;
            }
        }
        if (sum == DOT_TO_WIN)
            return true;
        int sum1 = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE && j >= 0; i++, j--) {
            if (map[i][j] == symb) sum1++;
        }
        if (sum1 == DOT_TO_WIN) {
            return true;

        }

        return false;
    }

    // попытка создать искуственный интелект
    public static int aiHardY2(int a) {
        // Крайний левый столбец
        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[0][0] == DOT_X) {
                        y = j + 1;
                        x = i;
                    }
                    if (map[0][1] == DOT_X) {
                        y = j + 1;
                        x = i;
                    }
                    if (map[0][2] == DOT_X) {
                        y = j -1;
                        x = i;
                    }
                }
            }
        }while (!isCellValid(x, y)) ;
        return y;
    }


    public static int aiHard2X(int a) {
        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[0][0] == DOT_X) {
                        y = j + 1;
                        x = i;
                    }
                    if (map[0][1] == DOT_X) {
                        y = j + 1;
                        x = i;
                    }
                    if (map[0][2] == DOT_X) {
                        y = j -1;
                        x = i;
                    }
                }
            }
        }while (!isCellValid(x, y)) ;
        return x;

    }
}






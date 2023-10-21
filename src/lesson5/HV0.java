package lesson5;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли.
public class HV0 {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        System.out.println(" Enter an integer");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect data. Try again");
            scanner.next();
        }
        int incr = scanner.nextInt();
        int[][] dimArr = new int[m][n];
        Random random = new Random();
        System.out.println("Massif");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dimArr[i][j] = random.nextInt(100);
                System.out.println(dimArr[i][j] + "");
                dimArr[i][j] += incr;
            }
            System.out.println();
        }
        System.out.println("Massif, Each element is increased by" + incr);
        System.out.println(Arrays.deepToString(dimArr));

    }

}

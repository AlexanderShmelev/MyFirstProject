package lesson5;

import java.util.Arrays;
import java.util.Random;

// Создайте двумерный массив. Выведите на консоль диагонали массива.
public class HV4 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j && j != (arr[i].length - 1)) {
                    arr[i][j] = 0;

                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}

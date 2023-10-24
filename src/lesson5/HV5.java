package lesson5;

import java.util.Arrays;
import java.util.Random;

//Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
//двумерного массива по возрастанию.
public class HV5 {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(8);

            }
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

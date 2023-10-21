package lesson5;

import java.util.Arrays;
import java.util.Random;

//Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
//элементов массива.
public class HV3 {
    public static void main(String[] args) {
        int[][] arr = new int[6][4];
        Random random = new Random();
        int sum = 0;
        for (int i = 0;i<arr.length; i ++){
            for (int j = 0;j< arr[i].length;j++){
                arr[i][j] = random.nextInt(9);
                sum += arr[i][j];

            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("The sum of all elements ="+ sum);
    }
}

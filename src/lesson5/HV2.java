package lesson5;

//Умножение двух матриц
//Создайте два массива целых чисел размером 3х3 (две матрицы).
//Напишите программу для умножения двух матриц.
//Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//Ожидаемый результат: 1 2 3 1 1 1 0 0 0
public class HV2 {
    public static void main(String[] args) {
        int[][] number1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] number2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] numberResult = new int[number1.length][number2[0].length];
        for (int i = 0; i < numberResult[0].length; i++) {
            for (int j = 0; j < numberResult.length; j++) {
                for (int m = 0; m < number1[0].length; m++) {
                    numberResult[i][j] = numberResult[i][j] + number1[i][m] * number2[m][j];

                }
                System.out.println(numberResult[i][j] + "");

            }

        }
    }

}

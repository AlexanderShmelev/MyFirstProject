package lesson4;

// Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше
public class HV3 {
    public static void main(String[] args) {
        int[] m1 = new int[5];
        int[] m2 = new int[5];
        for (int i = 0; i < m1.length; i++) {
            m1[i] = (int) (Math.random() * 6);
        }
        for (int i = 0; i < m2.length; i++) {
            m2[i] = (int) (Math.random() * 6);

        }
        for (int i = 0; i < m1.length; i++) {
            System.out.println(m1[i] + " ");
        }
        System.out.println();
        int a = 0;
        int b = 0;

        for (int i = 0; i < m1.length; i++) {
            a += m1[i];
        }
        System.out.println(a);
        for (int i = 0; i < m2.length; i++) {
            b += m2[i];
        }
        System.out.println(b);
        if (a > b) ;
        System.out.println("the first array is bigger");
        if (a == b) ;
        System.out.println("the sum of both arrays is equal to");
        if (a < b) ;
        System.out.println("the second array is bigger");

    }
}

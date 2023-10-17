package lesson4;
// Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Arrays;
import java.util.Scanner;

public class HV1 {
    public static void main(String[] args) {

        String[] array = {"2", "6", "14", "9", "4"};
        Scanner input = new Scanner(System.in);
        String target = input.nextBigInteger().toString();


        boolean found = Arrays.asList(array).contains(target);

        System.out.println(found);


    }

}

package упр.констр;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        switch (number){

            case 1:
                System.out.println("Красный!");
                break;
            case 2:
                System.out.println("Оранжевый!");
                break;
            case 3:
                System.out.println("Желтый!");
                break;
            case 4:
                System.out.println("Зелёный!");
                break;
            case 5:
                System.out.println("Голубой!");
                break;
            case 6:
                System.out.println("Синий!");
                break;
            case 7:
                System.out.println("Фиолетовый!");
                break;
        }
    }
}

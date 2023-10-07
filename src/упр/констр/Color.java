package упр.констр;

import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        switch (number) {

            case 1:
                System.out.println("Red!");
                break;
            case 2:
                System.out.println("Orange!");
                break;
            case 3:
                System.out.println("Yellow!");
                break;
            case 4:
                System.out.println("Green!");
                break;
            case 5:
                System.out.println("Blue!");
                break;
            case 6:
                System.out.println("Blu!");
                break;
            case 7:
                System.out.println("Purple!");
                break;
        }
    }
}

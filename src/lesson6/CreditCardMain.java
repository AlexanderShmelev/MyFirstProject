package lesson6;

import java.sql.SQLOutput;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("12345AS22");
        CreditCard secondCreditCard = new CreditCard("12345AS44");
        CreditCard thirdCreditCard = new CreditCard("12345AS66");

        firstCreditCard.addSum(5.0);
        secondCreditCard.addSum(50.0);
        thirdCreditCard.withdrawSum(1);

        System.out.println(firstCreditCard.getInfo());
        System.out.println(secondCreditCard.getInfo());
        System.out.println(thirdCreditCard.getInfo());

        System.out.println(thirdCreditCard.getSum());
        System.out.println(secondCreditCard.getSum());
        System.out.println(thirdCreditCard.getSum());


    }
}

package lesson7;

import java.sql.SQLOutput;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model,double weight){
        this(number,model);
        this.weight = weight;
    }
    public void receiveCall(String callerName){
        System.out.println("Звонит" + callerName);
    }
    public void receiveCall(String callerName, String CallerNumber){
        System.out.println("Звонит" + callerName + "("+CallerNumber+")");
    }
    public String getNumber(){
        return number;
    }
    public void sendMessage(String... numbers){
        System.out.println("Отправляються сообщения на следующие номера:");
        for (String num : numbers){
            System.out.println(num);
        }
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model= model;
    }
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

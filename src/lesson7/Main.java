package lesson7;

public class Main {
    public static void main(String[] args) {
        Phone phone1= new Phone("335468734","iPhone 14",2);
        Phone phone2= new Phone("298765643","honor H9");
        Phone phone3= new Phone();

        System.out.println("Phone1:Number-"+phone1.getNumber()+", Model-"+phone1.getModel()+",Weight-"+phone1.getWeight());
        System.out.println("Phone2:Number-"+phone2.getNumber()+", Model-"+phone2.getModel()+",Weight-"+phone2.getWeight());
        System.out.println("Phone3:Number-"+phone3.getNumber()+", Model-"+phone3.getModel()+",Weight-"+phone3.getWeight());

        phone1.receiveCall("Maria");
        phone2.receiveCall("Alex","298765643");
        phone3.sendMessage("335468734","298765643");


    }
}

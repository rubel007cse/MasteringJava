package EncapsulationAndGetterSetter;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class ATMBooth {
    public static void main(String args[]) {

        BankDetails bd = new BankDetails();
        bd.setAccount_name("Mosharrof Rubel");
        bd.setTotal_money(120);
        bd.setPin_number(1265);

        System.out.println("Account Name : " + bd.getAccount_name() + "\nTotal Money : " + bd.getTotal_money()
        +"\nPin: "+bd.getPin_number());


        // trying to access the variable without encapsulation. Remove the // to see the effect
        // String s1  =   bd.account_name;
        // System.out.println("First account name is: ");


        // trying to access a public variable public
         String s2 = bd.second_account;
         System.out.println("\nSecond account name is: "+s2);
    }
}

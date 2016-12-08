package EncapsulationAndGetterSetter;

/**
 * Created by mosharrofrubel on 12/8/16.
 */
public class BankDetails {

    // Private variable fields
    private String account_name;
    private int total_money;
    private int pin_number;

    // getter setter methods
    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public int getTotal_money() {
        return total_money;
    }

    public void setTotal_money(int total_money) {
        this.total_money = total_money;
    }

    public int getPin_number() {
        return pin_number;
    }

    public void setPin_number(int pin_number) {
        this.pin_number = pin_number;
    }

    // just declaring  a public variable
    public  String second_account="Rubel";

}

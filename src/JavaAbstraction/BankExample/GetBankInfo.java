package JavaAbstraction.BankExample;

/**
 * Created by mosharrofrubel on 12/22/16.
 */
public class GetBankInfo {

    public static void main(String[] args) {

        Bank obj;
        int charge;

        obj = new BRAC();
        charge = obj.yearly_charge();
        System.out.println("Bank yearly charge is: "+charge+" BDT");

        obj = new DBBL();
        charge = obj.yearly_charge();
        System.out.println("Bank yearly charge is: "+charge+" BDT");

        // calling method abobe is done by user/programmer

    }
}

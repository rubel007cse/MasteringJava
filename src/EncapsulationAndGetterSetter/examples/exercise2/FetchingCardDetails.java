package EncapsulationAndGetterSetter.examples.exercise2;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class FetchingCardDetails {

    public static void main(String[] s){

        SDCard sdCard = new SDCard();

        sdCard.setName("ExternalMemory");
        sdCard.setSize(16.0);
        sdCard.setFreeSpace(9.3);


        System.out.println("Card Name: "+sdCard.getName());
        System.out.println("Card Size: "+sdCard.getSize());
        System.out.println("Card Free Space: "+sdCard.getFreeSpace());
    }

}

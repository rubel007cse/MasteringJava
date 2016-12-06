package InheritancePro;

/**
 * Created by mosharrofrubel on 10/26/16.
 */
public class HarryClass extends OsbornNorman{

    public static void main(String[] args){

        // creating object of own class
        HarryClass object = new HarryClass();

        // Inheriting properties from OsbornNorman class
        object.research_of_lifetime();
        object.diseases_of_harry();

        // Inheriting variable
         int i = object.board_members;
         System.out.println("Inherited board members are: "+i);
    }

}

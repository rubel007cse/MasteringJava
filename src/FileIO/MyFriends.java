package FileIO;

import java.io.*;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class MyFriends {

    public static void main(String[] args){

        // ----------- creating file ---------------------
        File myFile = new File("friends.txt");

        // creating file
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }



        // ----------- writing file ---------------------
        try {
            FileWriter fw = new FileWriter(myFile);

            fw.write("Name: Tahir (Phone: 024602938477)\n");
            fw.write("Name: Ramim (Phone: 054602938478)\n");
            fw.write("Name: Ruhin (Phone: 074602938470)\n");
            fw.write("Name: Shimul (Phone: 104602938470)\n");

            fw.flush();
            fw.close();
            System.out.println("Contacts added successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }


        // ----------- reading file ---------------------

        try {
            FileReader fr = new FileReader(myFile);
            char[] data = new char[200];
            fr.read(data);
            System.out.println(data);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}

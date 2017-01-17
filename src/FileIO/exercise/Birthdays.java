package FileIO.exercise;

import java.io.*;

/**
 * Created by mosharrofrubel on 1/17/17.
 */
public class Birthdays {

    public static void main(String[] args){

        // ----------- creating file ---------------------
        File bdayFile = new File("birthdays.txt");

        try {
            bdayFile.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }



        // ----------- writing file ---------------------
        try {
            FileWriter fwriter = new FileWriter(bdayFile);

            fwriter.write("Name: Limon : 12 Jun\n");
            fwriter.write("Name: Rasel : 10 Oct\n");
            fwriter.write("Name: Siam  : 19 Aug\n");
            fwriter.write("Name: Swarna : 12 Feb");

            fwriter.flush();
            fwriter.close();

            System.out.println("Birthdays added successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }


        // ----------- reading file ---------------------

        try {
            FileReader freader = new FileReader(bdayFile);
            char[] bdays = new char[84];

            freader.read(bdays);
            System.out.println(bdays);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}

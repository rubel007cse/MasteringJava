package Generics.examples.example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class GenericMethods {

    public static void main(String[] j){

        List<String> myLibrary = new ArrayList<>();

        myBookShelf("Image Processing Book", myLibrary);
        myBookShelf("PHP learning Book", myLibrary);
        myBookShelf("Data Science Book", myLibrary);
        myBookShelf("IoT Book", myLibrary);

        System.out.println("Books:"+ myLibrary);

    }

    public static <T> void myBookShelf(T book, Collection<T> library){
        library.add(book);
    }

}

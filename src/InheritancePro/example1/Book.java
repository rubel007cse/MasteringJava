package InheritancePro.example1;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class Book extends Library {

    public static void main(String[] args){

        Library b = new Book();
        b.book_id();
        b.book_issue_date();

    }
}

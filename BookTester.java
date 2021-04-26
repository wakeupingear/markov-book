import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args)
    {
        String filePath="./thegreatgatsby.txt";
        //filePath = System.in("Enter the path to a file");
        Continuation newBook = new Continuation(filePath,6);
    }
}
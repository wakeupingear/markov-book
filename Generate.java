import java.util.ArrayList;

public class Generate {
    public static void main(String[] args)
    {
        String filePath="./thegreatgatsby.txt";
        //filePath = System.in("Enter the path to a file");
        Continuation newBook = new Continuation(6,filePath);
    }
}
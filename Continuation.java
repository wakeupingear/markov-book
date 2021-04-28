import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Continuation {
    int order;

    public Continuation(String inputText, int bookLength) {
        this(5, inputText, bookLength);
    }

    public Continuation(int newOrder, String filename, int bookLength) {
        order = newOrder;
        BufferedReader reader= new BufferedReader(new FileReader(new File(filename)));

        //Read through characters
        HashMap<String, ArrayList<Character>> letterOdds = new HashMap<String, ArrayList<Character>>();
        while (reader.ready()) {
        	char t = (char) reader.read();
        }
        reader.close();

        //Generate new book
        StringBuilder newText = new StringBuilder(bookText.substring(0, order));
        for (int i=order;i<bookLength;i++)
        {
            newText.append(NewLetter(newText.substring(i-order-1, i)));
        }
        PrintWriter writer = new PrintWriter("output.txt");
        writer.print(newText.toString());
        writer.close();
    }
    
    public String NewLetter(String input) {
    	return input;
    }
}
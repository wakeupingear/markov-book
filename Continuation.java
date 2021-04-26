import java.io.IOException;
import java.util.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Map;

public class Continuation {
    int order;

    public Continuation(String inputText, int bookLength) {
        this(5, inputText, bookLength);
    }

    public Continuation(int newOrder, String inputText, int bookLength) {
        order = newOrder;
        Scanner input = new Scanner(inputText);
        StringBuilder bookText = new StringBuilder();
        while (input.hasNextLine()) {
            bookText.append(input.nextLine());
        }
        input.close();

        //Read through characters
        Map<String, ArrayList<Char>> letterOdds = new Map<String, ArrayList<Char>>();
        for (int i=order;i<bookText.length();i++)
        {
            String key=(bookText.substring(i-order-1, i));
            Char nextLetter=bookText.charAt(i);
            if (!letterOdds.containsKey(key))
            {
                letterOdds.put(key,new ArrayList<Char>());
            }
            letterOdds.get(key).add(nextLetter);
        }

        //Generate new book
        StringBuilder newText = new StringBuilder(bookText.substring(0, order));
        for (int i=order;i<bookLength;i++)
        {
            newText.append(NewLetter(newText.substring(i-order-1, i)));
        }
    }
}
package Collections;
import java.util.*;

public class Pr {
   static String []words = new String[20];
    public static void main(String[] args) {
        setWords(words);
        getWords();
        Set<String> set = new HashSet<String>();
        Set<String> treeset = new TreeSet<String>(Arrays.asList(words));
        System.out.print("\nAFTER SORT : ");
        Collections.sort(Arrays.asList(words));
        System.out.println();
        getWords();
        set.addAll(Arrays.asList(words));
        System.out.println();
        System.out.println("SET : "+set);
        System.out.println("TREESET : "+treeset);
        freqwords();

        TelBook telBook  = new TelBook();
        telBook.addNumber(2323,"A");
        telBook.addNumber(1231,"A");
        telBook.addNumber(1111,"B");
        telBook.addNumber(1155,"B");
        telBook.addNumber(1116,"B");
        telBook.addNumber(2222,"C");
        System.out.println();
        telBook.getNumber("A");
        telBook.getNumber("B");
        telBook.getNumber("C");

    }

    public static void setWords(String[] words) {
              //
        for (int i = 0; i <words.length ; i++) {

            StringBuilder b = new StringBuilder();
            for (int j = 0; j <5 ; j++)
            {
                int r = (int)(Math.random()*2);
                b =b.append(String.valueOf ((char)(j+65+r)));
            }
            words[i] = b.toString();
        }
    }

    public static void getWords() {
        System.out.print("WORDS : ");
        for (int i = 0; i <words.length ; i++) {
            System.out.print((i+1)+"# "+words[i]);
        }
    }
    public static void freqwords()
    {
        for (int i = 0; i <words.length ; i++)
        {
            System.out.print(" Freq "+Collections.frequency(Arrays.asList(words),words[i])+" "+words[i]);
        }
    }
}

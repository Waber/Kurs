package pl.kurs.hasze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pair {

    public static void main(String[] args) {

        Map<String, String> pairMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String temp1 = "", temp2 = "";

        while (!temp1.equals("-") && !temp2.equals("-")) {
            System.out.println("Podaj imię pierwszej osoby z pary (aby przerwać wpisz -");
            temp1 = in.nextLine();
            if (!temp1.equals("-")) {
                System.out.println("Podaj imię drugiej osoby z pary (aby przerwać wpisz -");
                temp2 = in.nextLine();
                if (!temp2.equals("-"))
                    pairMap.put(temp1, temp2);
            }
        }

        System.out.println("Podaj imię pierwszego członka pary, którą chcesz wyświetlić");
        temp1 = in.nextLine();


      /* Dzięki poniższesz pętli można pobrać drugą osobę z pray niezależnie od tego czy wprowadzimy imię pierwsze czy
         drugie

        for (Map.Entry<String, String> entry : pairMap.entrySet()) {
            if(entry.getKey().equals(temp1))
                System.out.println(entry.getKey() + ": " + entry.getValue());
            else if(entry.getValue().equals(temp1))
                System.out.println(entry.getValue() + " " + entry.getKey());
            else if(pairMap.containsKey())
                System.out.println("Nie ma pary z takim imieniem");
            
        }
*/
      if(pairMap.containsKey(temp1))
          System.out.println(temp1 + ": " + pairMap.get(temp1));
      else
          System.out.println("Nie ma pary z osobą o takim imieniu");

    }
}

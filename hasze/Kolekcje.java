package pl.kurs.hasze;

import java.util.*;

public class Kolekcje {

    public static void main(String[] args) {
        Set<String> namesSet = new HashSet<>();
        Scanner in = new Scanner((System.in));
        String tempName="";

        System.out.println("Wprowadzaj kolejne imiona, żeby przerwać wprowadź - ");

        while(true)
        {
            tempName = in.nextLine();
            if(tempName == null)
                throw new IllegalArgumentException("Wprowadź imię");
            else if(tempName.equals("-"))
                break;
            namesSet.add(tempName);

        }

        System.out.println("Zawartość zbioru");
        for (String item : namesSet)
        {
            System.out.println(item);
            
        }

    }
}

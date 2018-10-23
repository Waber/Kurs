package pl.kurs.anonymous;

import java.util.*;

public class ListSort {

    private List<String> argList = new LinkedList<>();

    public ListSort()
    {
        System.out.println("Podaj pięc różnych wyrazów");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            argList.add(in.next());
        }
    }

    public void printList()
    {
        for (String argument: argList) {
            System.out.println(argument);
        }
    }

    public List<String> getArgList() {
        return argList;
    }

    public static void main(String[] args) {
        ListSort forSort = new ListSort();
        System.out.println("Lista przed sortowaniem: ");
        forSort.printList();
        Collections.sort(forSort.getArgList(), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("Po sortowaniu: ");
        forSort.printList();
    }


}

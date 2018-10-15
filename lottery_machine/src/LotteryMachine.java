package pl.kurs.lottery_machine.src;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LotteryMachine {

    private final static Pattern FIELD_PATTERN = Pattern.compile("^\"(.+)\"$");


    private List<String> mails = new LinkedList<>();
    private List<String> winners = new LinkedList<>();

    private final String fileAddress;
    private final int winnersCount;

    public LotteryMachine(String fileAddress, int winnersCount) throws IOException {
        this.fileAddress = fileAddress;
        this.winnersCount = winnersCount;
        inputFromFile();
    }


    public void inputFromFile() throws IOException {
        BufferedReader input = null;
        String line;

        try
        {
            input = new BufferedReader(new FileReader (fileAddress));
            while(true)
            {
                line = input.readLine();
                if(line == null) {
                    break;
                }
                String[] temp =  line.split(",");
                mails.add(parseField(temp[2]));
                if(parseField(temp[4]) != null) {
                    mails.add(parseField(temp[4]));
                }
            }
        } finally {
            if(input != null) {
                input.close();
            }
        }
        mails.remove(0);

    }

    public void winnerSearch()
    {
        Collections.shuffle(mails);
        winners.clear();
        for(int i = 0; i < winnersCount; i++)
        {
            winners.add(mails.get(i));
        }
        for (String winner: winners) {
            System.out.println(winner);
        }
    }

    public List<String> getList()
    {
        return Collections.unmodifiableList(mails);
    }

    private static String parseField(String field)
    {
        Matcher fieldMatcher = FIELD_PATTERN.matcher(field);
        if (fieldMatcher.matches())
        {
            return fieldMatcher.group(1);
        }
        return null;
    }



    public static void main(String[] args) throws IOException {
        System.out.println("Podaj najpierw ścieżkę do pliku a następnie ilość wygranych osób");
        Scanner in = new Scanner(System.in);
        String address = in.next();
        int numberOfWinners = in.nextInt();
        LotteryMachine machine = new LotteryMachine(address,numberOfWinners);
        System.out.println(machine.getList());
        //machine.winnerSearch();


    }

}

package pl.kurs.test;

import java.util.Scanner;

public class Average {



  //private  int numberOfClasses;
  //private  int numberOfNotes;
    Scanner noteReader = new Scanner(System.in);
    float[] averageDegree;
    private int[][] notes;

    public Average(int numberOfClasses, int numberOfNotes)
    {
       // this.numberOfClasses = numberOfClasses;
        //this.numberOfNotes = numberOfNotes;
        notes = new int[numberOfClasses][numberOfNotes];
        averageDegree = new float[numberOfClasses];
    }


    public void getNotes()
    {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                System.out.println("Please insert the " +(j + 1)+ " note for subject nr " + (i + 1   ));
                notes[i][j] = noteReader.nextInt();
            }

        }
    }

    public void printAverage()
    {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                averageDegree[i] += notes[i][j];
            }
            averageDegree[i] /= notes[i].length;
            System.out.println("The average degree from subject nr "+(i +1)+" is " + averageDegree[i]);

        }
    }

    public static void main(String[] args) {

        Scanner read = new Scanner((System.in));
        System.out.println("Please insert the number of subjects");
        int numberOfClasses = read.nextInt();
        System.out.println("Please insert the number of notes");
        int numberOfNotes = read.nextInt();

        Average avDeg= new Average(numberOfClasses,numberOfNotes);
        avDeg.getNotes();
        avDeg.printAverage();




    }
}

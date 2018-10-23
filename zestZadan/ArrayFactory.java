package pl.kurs.zestZadan;

public class ArrayFactory {

    private int x;

    public ArrayFactory(int x)
    {
        this.x = x;
    }

    public int[] oneDimension()
    {
        return new int[x];
    }

    public int[][]twoDimension()
    {
        return new int[x][x];
    }

    public int[][] matrix()
    {
        int[][] tab = twoDimension();

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length ; j++) {
                tab[i][j] = 0;
                if(i == j)
                    tab[i][j] = 1;

            }
        }

        return tab;
    }

    public static void main(String[] args) {
        ArrayFactory a = new ArrayFactory(5);
        int tab[][] = a.matrix();
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j <tab[i].length ; j++) {
                System.out.print(tab[i][j]+",");
                if(j == tab[i].length-1)
                    System.out.println();

            }

        }

    }
}

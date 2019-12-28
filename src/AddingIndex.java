import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

class AddingIndex
{
    public static void main(String args[])
    {
        int sum = 0;
        int g,i,j;
        int[][] ff, gg, hh, dd;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int initalNumber = reader.nextInt();

        //gg =  new int[initalNumber];

        while (reader.hasNextInt())
        {
            int w = reader.nextInt();

            for( i=0; i<initalNumber; i++)
            {
                gg = new int[initalNumber][i];
             //   System.out.println(gg[initalNumber][i]);

                for(j=0; j < w; j++)
                {
                    gg[j][i] = gg[j][w];
                    System.out.println(gg[j][w]);
                }

            }

        }
    }
}

//Written 8/29/19

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class AddLastTwo
{
    public static void main(String[] args)
    {
        int sum = 0;
        int[] total = new int[1000];

        Scanner in = new Scanner(System.in);
        int startNum = in.nextInt();
        int start = startNum;
        in.nextLine();

        for(int y = 0; y < start; y++)
        {
                String num = in.nextLine();

                if (!num.isEmpty())
                {
                    String[] column = num.split("\\s+");
                    int[] row = new int[column.length];

                    for (int i = 1; i < column.length; i++)
                    {
                        row[i] = parseInt(column[i]);
                    }

                    for (int i = 1; i < row.length; i++)
                    {
                        int a = row[column.length - 2];
                        int b = row[column.length - 1];

                        sum = row[a] + row[b];
                    }
                }

        total[y] = sum;
        }

        for (int w= 0; w<total.length;w++)
        {
            if(total[w] != 0)
            {
                System.out.println(total[w]);
            }
        }
    }
}



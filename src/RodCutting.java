// A Dynamic Programming solution for Rod cutting problem
import java.util.Scanner;
import static java.lang.Integer.parseInt;

class RodCutting
{
    /* Returns the best obtainable price for a rod of
    length n and price[] as prices of different pieces */
    static int cutRod(int price[],int n)
    {
        int val[] = new int[n+1];
        val[0] = 0;

        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i <= n; i++)
        {
            int max_val = 999999;
            for (int j = 0; j < i; j++)
                max_val = Math.min(max_val, price[j] + val[i-j-1]);
            val[i] = max_val;
        }

        return val[n];
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int startNum = in.nextInt();
        int cuttingPoints = in.nextInt();

        int[] array = new int[cuttingPoints];

            for (int i = 0; i < array.length; i++)
            {
                if(cuttingPoints<=array.length)
                {
                    array[i] = in.nextInt();
                }
                else
                {
                    break;
                }

            }

            int size = array.length;
        System.out.println("Maximum Obtainable Value is " +
                cutRod(array, size));

    }
}

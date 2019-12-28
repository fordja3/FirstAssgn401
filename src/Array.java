
// Written by Jason Ford - 10/2/19
//

import java.util.Scanner;
import java.lang.String;
import static java.lang.Integer.*;

public class Array
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int startNum = in.nextInt();

        int start = startNum;
        in.nextLine();

        int[] total = new int[start];
        int[] pipe = new int[start];
        String[] numnum = new String[start];

        for (int y = 0; y < start; y++)
        {
            Scanner nn = new Scanner(System.in);
            String num = nn.nextLine();

            numnum = num.trim().split("\\s+");

            total[y]  = parseInt(numnum[0])*parseInt(numnum[1]);

            pipe[y] = parseInt(numnum[1]);

        }

        qs sorty = new qs();

        sorty.sort(total, 0, total.length-1);
        sorty.sort(pipe,0,pipe.length-1);

        sorty.printOut(total);
        sorty.printOut(pipe);

        int middle = total[(total.length-1)/2];
        // int middle = (total[pipe[pipe.length/2]] + total[total.length-1])/2;

        System.out.println((middle/2) + 1);

    }

    static class qs
    {
        int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low - 1);

            for (int j = low; j < high; j++)
            {
                if (arr[j] < pivot)
                {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }

        void sort(int arr[], int low, int high)
        {
            if (low < high)
            {
                int part = partition(arr, low, high);

                sort(arr, low, part - 1);
                // sort(arr, part + 1, high);
            }
        }

        static void printOut(int arr[])
        {
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i] != 0)
                {
                    System.out.print(arr[i]);
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}


//   System.out.println(pipe[(pipe.length/2)-1]);
//   System.out.println(sorty.add(pipe));
//int pipeline = (total[(total.length/2)-1]+total[(total.length/2)])/2;
//   sorty.printOut(pipe);
//  sorty.sort(pipe,0,total.length-1);
//            pipe[y] = Integer.parseInt(numnum[1]);

/*
*
*
* 6
1 2
8 1
4 1
6 2
2 3
7 1
        static int add(int[] arr)
        {
            int added = 0;

            for (int i = 0; i < arr.length - 1; i++)
            {
                added = arr[i] + arr[i+1];

            }
            return added;
        }
*
*
*
* */
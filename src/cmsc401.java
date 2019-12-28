//***************************
// Written by Jason Ford - 10/2/19
// Assignment 2
//
//***************************

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class cmsc401
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        qs sorty = new qs();

        int[] total = new int[start*2];
        int[] pipe = new int[start*2];

        for (int y = 0; y < start*2; y++)
        {
            // Holds all the input values
            int cost = scanner.nextInt();
            total[y] = cost;

        }

        // Sorts values to determine partition
        sorty.sort(total, 0, total.length-1);

        // Partition
        pipe = Arrays.copyOfRange(total, total.length/2, total.length-1);

        System.out.println(pipe[pipe.length/2]);

    }

    static class qs
    {
        int size;
        int cost;

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
                sort(arr, part + 1, high);
            }
        }

        static void printOut(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.print(arr[i]);
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}


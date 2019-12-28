// Jason Ford
//
import java.util.*;
import java.lang.*;
import static java.lang.Integer.parseInt;

class cmsc402
{
    public static void main(String[] args)
    {
        Scanner inn = new Scanner(System.in);
        String M1 = inn.nextLine();
        String N1 = inn.nextLine();
        int M = parseInt(M1);
        int N = parseInt(N1);

        int matrix2[][] = new int[M][N];


        for (int y = 0; y < M; y++)
        {
            String num1 = inn.nextLine();
            String num2 = num1.replace("C", "").replace(":", "").replace("H", "");

            if (!num2.isEmpty())
            {
                String[] column = num2.split("\\s+");
                int[] num = new int[M];

                for (int i = 1; i < column.length; i++)
                {
                    num[i] = Integer.parseInt(column[i]);

                    if (num[i] > 0)
                    {
                        matrix2[y][num[i]-1] = 1;
                    }
                    else
                    {
                        matrix2[y][i] = 0;
                    }
                }
            }
        }

        cmsc402 room = new cmsc402();
        System.out.println(room.numberOfRooms(matrix2, M, N));

    }

    public boolean roomMatching(int matrix2[][], int u, boolean visited[], int matchRoom[], int M, int N)
    {
        for (int v = 0; v < N; v++)
        {
            if (matrix2[u][v] == 1 && !visited[v])
            {
                visited[v] = true;

                if (matchRoom[v] < 0 || roomMatching(matrix2, matchRoom[v], visited, matchRoom, M, N))
                {
                    matchRoom[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    public int numberOfRooms(int matrix2[][], int M, int N)
    {
        int matchRoom[] = new int[N];
        int result = 0;

        //set all rooms to available
        for (int i = 0; i < N; ++i)
        {
            matchRoom[i] = -1;
        }

        for (int u = 0; u < M; u++)
        {
            boolean visited[] = new boolean[N];

            if (roomMatching(matrix2, u, visited, matchRoom, M, N ))
                result++;
        }

        return result;
    }
}
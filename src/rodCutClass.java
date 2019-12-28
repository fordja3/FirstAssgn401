//We use recursive solution to solve this


import java.lang.*;
import java.util.*;

public class rodCutClass
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int StartNum = in.nextInt();
        int CutPoints = in.nextInt();

        int[] array = new int[CutPoints];

        for (int i = 0; i < array.length; i++)
        {
            if(CutPoints<=array.length)
            {
                array[i] = in.nextInt();
            }
            else
            {
                break;
            }

        }

        rodCutClass obj=new rodCutClass();
        System.out.println(obj.CutRod(0,StartNum,array));
    }

    public int CutRod(int RodStart,int RodEnd,int []CutPointsArray)
    {

        if(CutPointsArray.length==0)
        {
            return 0;
        }
        else if(CutPointsArray.length==1)
        {
            return RodEnd - RodStart;
        }

        else
        {
            int Minimum = 9999999;

            for (int i = 0; i < CutPointsArray.length; i++)
            {
                int[] LeftSide = new int[i];
                int[] RightSide = new int[CutPointsArray.length - i - 1];

                int CurrentRodLength = RodEnd - RodStart;
                for (int j = 0; j < i; j++)
                {
                    LeftSide[j] = CutPointsArray[j];
                }
                for (int j = 1; j < CutPointsArray.length - i; j++)
                {
                    RightSide[j - 1] = CutPointsArray[i + j];
                }

                Minimum = Math.min(Minimum, CurrentRodLength + (CutRod(RodStart, CutPointsArray[i], LeftSide)
                                                             +  CutRod(CutPointsArray[i], RodEnd, RightSide)));
            }

            return Minimum;

        }
    }
}
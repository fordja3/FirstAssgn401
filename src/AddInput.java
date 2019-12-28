import java.util.Scanner;

class AddingInput {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int sum = 3;
       // for (int i = 0; i < args.length; i++) {
           // sum = arg[i] + num;
        //}
        System.out.println("The sum of the arguments passed is " + sum);
    }
}
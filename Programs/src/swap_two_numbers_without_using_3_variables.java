import java.util.Scanner;

public class swap_two_numbers_without_using_3_variables {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter X : ");
        int x=scanner.nextInt();
        System.out.print("Enter Y : ");
        int y=scanner.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println(" X : "+x);
        System.out.println(" Y : "+y);

        //x=2;
        //y=3;
        /*

        x=2+3 ==> 5;
        x=5;
        y=3;
        y=x-y ==> 5-3  ==> y=2;
        y= 2;
        x=5;
        x=x-y;  5-2 ==> 3;
         */






    }


}

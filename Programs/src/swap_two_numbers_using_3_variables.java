import java.util.Scanner;

public class swap_two_numbers_using_3_variables {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter X : ");
        int x=scanner.nextInt();
        System.out.print("Enter Y : ");
        int y=scanner.nextInt();
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println(" X : "+x);
        System.out.println(" Y : "+y);



    }
}

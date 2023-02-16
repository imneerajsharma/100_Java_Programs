import java.util.Scanner;
public class add_2_numbers {

    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter X : ");
        int x=scanner.nextInt();
        System.out.print("Enter Y : ");
        int y=scanner.nextInt();
        int z=x+y;
        System.out.println("Sum of  X & Y : "+z);

    }
}

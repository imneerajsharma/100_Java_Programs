import java.util.Scanner;
public class largest_Number {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 3 Values ");
        System.out.print("Enter X : ");
        int x=scanner.nextInt();
        System.out.print("Enter Y : ");
        int y=scanner.nextInt();
        System.out.print("Enter Z : ");
        int z=scanner.nextInt();

        if(x>y && x>z){
            System.out.println(x + " : is a largest number ");
        }
        else if(y>x && y>z){
            System.out.println(y + " : is a largest number ");
        }
        else{
            System.out.println(z + " : is a largest number ");
        }

        int largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);


        System.out.println(largest + " : is a largest number using ternary operator ");



    }
}

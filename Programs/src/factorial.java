import java.util.Scanner;
public class factorial {
    static int result=1;

    static int fact(int n){
        while(n>0){             // using loop
            result*=n;
            n--;
        }
        return result;
    }

    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the Value : ");
        int input=scanner.nextInt();
        int result=1;
        result= fact(input);

        System.out.println("Factorial of "+ input +" is :"+result);
    }
}

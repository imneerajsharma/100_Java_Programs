import java.util.Scanner;

public class print_Reverse_Number {
    static void reverse(int n){
        int reverse=0;

        while(n>0){
            reverse=reverse*10;
            reverse+=n%10;
            n=n/10;
        }

        System.out.println("Reversed number is : "+reverse);
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.print("Enter  a Value : ");
            int input=scanner.nextInt();
            reverse(input);
        }
        finally{
            scanner.close();
        }

    }
}

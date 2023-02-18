import java.util.Scanner;
public class armstrong_Number {

    static void check_Arm(int num){
        int n=0;
        int sum=0;
        int temp=num;
        if(num<10){
            System.out.println("Entered number is not an Armstrong Number");
        }
        while(num>=1){
            n=num%10;
            sum+=n*n*n;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Entered number is a Armstrong Number");
        }
        else{
            System.out.println("Entered number is not an Armstrong Number");
        }
    }


    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter any number to check whether it is a Armstrong or not : ");
        int num=scanner.nextInt();
        check_Arm(num);
        scanner.close();

    }
}

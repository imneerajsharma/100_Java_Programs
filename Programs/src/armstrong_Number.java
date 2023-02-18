import java.util.Scanner;
public class armstrong_Number {

    static int check_Arm(int num){
        int n=0;
        int sum=0;
        int temp=num;
        if(num<10){
            System.out.println("Entered number is not an Armstrong Number");
            return -1;
        }
        /*
        int n=0;
        while(num>=1){
            n=num%10;
            sum+=n*n*n;
            num=num/10;
        }
        */

        // #### Optimized Code #### //

        /*

        1. Store the number of digits ("Math.floor(Math.log10(num))+1") in a separate variable:
        Since we use the number of digits in two different places,
        it makes sense to store it in a separate variable to avoid recalculating it.

        a.  Math.log10(x) calculates the base-10 logarithm of x.
        b.  Math.log10(x) + 1 adds 1 to this logarithm to get the number of digits before the decimal point.
        c.  Math.floor(Math.log10(x) + 1) takes the floor of the result,
            which rounds the value down to the nearest integer.
            This is because the number of digits in an integer is always a whole number,
            and this expression may result in a decimal value.

        d. For example, if x is 123, Math.floor(Math.log10(x) + 1) will return 3,
           because there are three digits in 123. If x is 0, Math.floor(Math.log10(x) + 1)
           will return 0, because there are no digits in 0.


        2. Use a for loop instead of a while loop: A for loop is better suited for this scenario
        as it allows us to iterate through the digits of the number in a more concise manner.

         */

        int nums_of_Digits=0;
        nums_of_Digits=(int)Math.floor(Math.log10(num))+1;
        for(int i=0;i<nums_of_Digits;i++){
            n=num%10;
            sum+=Math.pow(n,nums_of_Digits);
            num=num/10;
        }

        /*
        In Java, Math.pow(a, b) is a method that returns the value of a raised to the power of b.
        For example, Math.pow(2, 3) will return 8, because 2 raised to the power of 3 is 8.
         */


        if(sum==temp){
            System.out.println("Entered number is a Armstrong Number");
        }
        else{
            System.out.println("Entered number is not an Armstrong Number");
        }
        return 0;
    }


    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter any number to check whether it is a Armstrong or not : ");
        int num=scanner.nextInt();
        check_Arm(num);
        scanner.close();

    }
}

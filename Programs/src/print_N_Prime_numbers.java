
import java.util.Scanner;
public class print_N_Prime_numbers {
    static boolean is_Prime(int num){
        if(num==1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

    static void print_N_Prime(int num){
/*        int count=0;
        int n=0;

        while(count<num){
            if(is_Prime(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }
*/

        // ######  Optimized code ######//
        /*
        1. Check if the number is even before calling the is_Prime() method:
        Since all even numbers (except 2) are not prime, we can avoid calling the is_Prime() method for even numbers.

        2. Start the loop from 3 and increment by 2:
        Since all even numbers have already been handled, we can start the loop from 3 and
        increment by 2 in order to only check odd numbers.

        3. Use a for loop instead of a while loop: A for loop is better suited for this scenario
        as it allows us to declare the loop counter variable and specify the condition in a single line.

         */
        if(num>=1){
            System.out.println("2");
        }
        int counter=1;
        for(int i=3;counter<num;i+=2){
            if(is_Prime(i)){
                System.out.println(i);
                counter++;
            }
        }
    }

    public static void main (String[] args){
        Scanner scanner =new Scanner (System.in);
        System.out.print("Enter the number of Primes to Print : ");
        int num=scanner.nextInt();
        print_N_Prime(num);

    }
}

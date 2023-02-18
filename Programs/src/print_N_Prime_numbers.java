
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
        int count=0;
        int n=0;

        while(count<num){
            if(is_Prime(n)){
                System.out.println(n);
                count++;
            }
            n++;

        }
    }

    public static void main (String[] args){
        Scanner scanner =new Scanner (System.in);
        System.out.print("Enter the number of Primes to Print : ");
        int num=scanner.nextInt();
        print_N_Prime(num);
       // is_Prime(num);
//        if(is_Prime(num)){
//            System.out.println(num+" is a Prime Number");
//        }
//        else{
//            System.out.println(num+" is not a Prime Number");
//        }
    }
}

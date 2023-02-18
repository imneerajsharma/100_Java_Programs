import java.util.Scanner;
public class prime_Number_Checker {

    static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main (String [] args){

    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter any number ");
    int num=scanner.nextInt();
    if(isPrime(num)){
        System.out.println("Number is Prime");
    }
    else{
        System.out.println("Number is not Prime");
    }



    }
}

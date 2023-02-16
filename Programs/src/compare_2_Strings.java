import java.util.Scanner;
public class compare_2_Strings {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter String S1: ");
        String S1=scanner.nextLine();
        System.out.print("Enter String S2: ");
        String S2=scanner.nextLine();

        //The compareTo() method compares two strings lexicographically.
        //The comparison is based on the Unicode value of each character in the strings.

        if(S1.compareTo(S2)>0){

            System.out.print("S1: is greater than S2 ");
        }
        else if(S1.compareTo(S2)<0){
            System.out.print("S2 is greater than S1 ");
        }
        else
            System.out.print("S1 and S2 are equal in Size ");
    }
}

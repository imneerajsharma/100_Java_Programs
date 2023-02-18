import java.util.Scanner;
public class Prints_All_The_SubString {

    static void print_sub_String(String str){

        System.out.println("All Sub Strings Are: ");
        for(int i=0; i<=str.length();i++){
            for(int j=1;j<=str.length()-i;j++){
                System.out.print(str.substring(i,i+j)+" , ");
            }
            System.out.println();

        }
    }

    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a String to print all its sub strings : ");
        String str=scanner.nextLine();

        print_sub_String(str);


    }
}

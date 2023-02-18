import java.util.Scanner;
public class Prints_All_The_SubString {

    static void printSubstrings(String str){

        StringBuilder sb= new StringBuilder();

        for(int i=0; i<str.length();i++){
            for(int j=1;j<=str.length()-i;j++){
                sb.append(str.substring(i,i+j)).append(" , ");
            }
            sb.append(System.lineSeparator());

        }

        System.out.println(sb.toString());
    }

    public static void main (String[] args){
        try(Scanner scanner =new Scanner(System.in))
        {
            System.out.print("Enter a String to print all its sub strings : ");
            String str=scanner.nextLine();

            printSubstrings(str);
        }




    }
}

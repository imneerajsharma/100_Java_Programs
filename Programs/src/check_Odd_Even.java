import java.util.Scanner;
public class check_Odd_Even {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("X : ");
        int x=scanner.nextInt();

        String result= (x%2==0)?"X  is a EVEN number ":"X  is a ODD number ";
        System.out.println(result);

        if(x%2==0){
            System.out.println("X  is a even number ");
        }
        else{
            System.out.println("X  is a odd number ");
        }

    }
}

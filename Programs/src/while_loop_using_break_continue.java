import java.util.Scanner;

public class while_loop_using_break_continue {

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.print("Enter  a Value : ");
            while(true) {
                int input=scanner.nextInt();

            if(input!=0){
                System.out.print("Entered Value  is : "+input);
                continue;
            }
            else{
                System.out.print("Entered Value  is : "+input);
                break;
            }
            }

        }
        finally{
            scanner.close();
        }

    }
}

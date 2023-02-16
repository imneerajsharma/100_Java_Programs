import java.util.Scanner;
public class get_Input_From_User {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        String input= scanner.nextLine();

        try{
            int intValue= Integer.parseInt(input);
            System.out.println("Input is an integer");
        } catch(NumberFormatException e){
            try{
                float floatValue =Float.parseFloat(input);
                System.out.println("input is a floating-point number");
            }catch(NumberFormatException ex){
                if(input.length()==1){
                    char charValue=input.charAt(0);
                    System.out.println("input is a character");
                }else{
                    System.out.println("input is a string");
                }
            }
        }


    }
}

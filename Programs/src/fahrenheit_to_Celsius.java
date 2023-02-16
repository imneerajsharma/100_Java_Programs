import java.util.Scanner;
public class fahrenheit_to_Celsius {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit : ");
        String input;
        input=scanner.nextLine();

        try{
            int intValue=Integer.parseInt(input);
            intValue=((intValue-32)*5)/9;
            System.out.println("Temperature in Celsius : "+intValue);
        }catch(NumberFormatException e){
            try{
                float floatValue=Float.parseFloat(input);
                floatValue=((floatValue-32)*5)/9;
                System.out.println("Temperature in Celsius(float) : "+floatValue);
            }catch(NumberFormatException ex){

                if (input.matches("[^a-zA-Z0-9]+")) {
                    System.out.println("Input is a symbol.");
                }
                else if(input.length()==1){
                    System.out.println("you have enter a character");
                }
                else{
                    System.out.println("you have enter a String");
                }
            }
        }

    }
}

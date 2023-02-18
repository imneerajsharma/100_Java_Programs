import java.util.Scanner;

public class floyds_Triangle {

    static void print_floyd_Triangle(int num){
        int count=1;
        StringBuilder sb= new StringBuilder();
        if(num<1){
            System.out.println("Pleas enter a number greater than 1");
        }

        /*
            // #### Optimized Code #### //

            1.  StringBuilder sb= new StringBuilder();
            2.  sb.append(count).append(" ");
            3.  sb.append("\n");
            4.  sb.toString()

            1. Creating a new instance of the StringBuilder class, which initializes an empty string buffer.

            2.  Then, in the code I provided, the sb object is used to concatenate the output of the Floyd's Triangle numbers.
                The append() method of StringBuilder is used to add each number to the string buffer.
                By doing this, we are building the output string in memory rather than printing each number
                to the console individually. This is generally more efficient because it reduces the number of I/O operations.

            3.  Finally, the toString() method is called on the sb object to get the final string,
                which is then printed to the console.

            4.  In summary, StringBuilder is a class that provides a more efficient way to concatenate strings in Java.

         */
        else{
            System.out.println("Floyd's Triangle :");
            for(int i=0;i<num;i++){
                for(int j=0;j<=i;j++){
                    //System.out.print(count+" ");
                    sb.append(count).append(" ");
                    count++;
                }
                sb.append("\n");

                //System.out.println();
            }
        }
        System.out.print(sb.toString());
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("How Many rows you need in a Floyd's Triangle : ");
        int num=scanner.nextInt();

        print_floyd_Triangle(num);
    }




}

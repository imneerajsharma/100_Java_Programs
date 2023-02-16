import java.util.Scanner;
public class star_Pattern {
/*
## Printing the pattern 1 ##
 *
 **
 ***
 ****

 */

    public static void pattern1(int n)
    {
        for(int i=0;i<=n;i++){
            for(int j=0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    /*
## Printing the pattern 2 ##
******
******
******
******
******
******

 */
    public static void pattern2(int n)
    {
        for(int i=0;i<=n;i++){
            for(int j=0 ; j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n=scanner.nextInt();
        pattern2(n);

    }
}

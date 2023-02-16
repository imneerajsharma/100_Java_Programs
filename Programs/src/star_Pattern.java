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


    /*
## Printing the pattern 3 ##
******
*****
****
***
**
*

*/
    public static void pattern3(int n)
    {
        for(int i=n;i>=0;i--){
            for(int j=0 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

/*
## Printing the pattern 4 ##
     *
    **
   ***
  ****
 *****
******

*/
public static void pattern4(int n)
{
    for(int i=0;i<=n;i++){
        for(int j=n ; j>i;j--){
            System.out.print(" ");
        }
        for(int k=0 ; k<=i;k++){
            System.out.print("*");
        }


        System.out.println();

    }
}





    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n=scanner.nextInt();
        pattern4(n);

    }
}

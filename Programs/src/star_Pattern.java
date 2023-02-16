import java.util.Scanner;
public class star_Pattern {
    public static void pattern1(int n)
    {   System.out.println();
        System.out.println("Pattern  : 1 ");
        for(int i=0;i<=n;i++){
            for(int j=0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    public static void pattern2(int n)
    {   System.out.println();
        System.out.println("Pattern  : 2 ");
        for(int i=0;i<=n;i++){
            for(int j=0 ; j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

    public static void pattern3(int n)
    {   System.out.println();
        System.out.println("Pattern  : 3 ");
        for(int i=n;i>=0;i--){
            for(int j=0 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

public static void pattern4(int n)
{   System.out.println();
    System.out.println("Pattern  : 4 ");
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
    public static void pattern5(int n)
    {   System.out.println();
        System.out.println("Pattern  : 5 ");
        for(int i=0;i<=n;i++){

            for(int j=n ; j>i;j--){
                System.out.print(" ");
            }
            for(int k=0 ; k<(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void pattern6(int n)
    {
        System.out.println();
        System.out.println("Pattern  : 6 ");
        for(int i=n;i>=0;i--){

            for(int k=1 ; k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
            for(int j=n ; j>=i;j--){
                System.out.print(" ");
            }


        }

    }

    public static void pattern7(int n)
    {
        System.out.println();
        System.out.println("Pattern  : 7 ");

        for(int i=0;i<=n;i++){

            for(int j=n ; j>i;j--){
                System.out.print(" ");
            }
            for(int k=0 ; k<(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1 ; j>=i;j--){
                System.out.print(" ");
            }

            for(int k=1 ; k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }




    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter the Value : ");
//        int n=scanner.nextInt();
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);

    }
}

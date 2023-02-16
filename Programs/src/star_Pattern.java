import java.util.Scanner;
public class star_Pattern {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int n=scanner.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}

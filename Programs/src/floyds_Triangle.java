import java.util.Scanner;

public class floyds_Triangle {

    static void print_floyd_Triangle(int num){
        int count=1;
        if(num<1){
            System.out.println("Pleas enter a number greater than 1");
        }
        else if (num==1){
            System.out.println("1");
        }
        else{
            System.out.println("Floyd's Triangle :");
            for(int i=0;i<num;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("How Many rows you need in a Floyd's Triangle : ");
        int num=scanner.nextInt();

        print_floyd_Triangle(num);
    }




}

package jakircore4.com;
import java.util.Scanner;
public class PositiveNegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
//        int sum, x =0;
        int sum=0, x =0;
        while(true){
        x=sc.nextInt();
        if(x>0){
        sum +=x;
        }else{
       if(x<0){
       break;
       } 
        }
       System.out.println("sum is "+sum);
        }
    }
}

package jakircore4.com;
import java.util.Scanner;
public class CompearNumberBigSmallQ3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println(x + "is big  ");
        } else {
            if (y > x && y > z) {
                System.out.println(y + "is big  ");
            } else {
            System.out.println(z + "is Big  ");
            }          
        }
  if (x < y && x < z) {
            System.out.println(x + "is Small  ");
           } else {
              if (y < x && y < z) {
               System.out.println(y + "is Small  ");
                } else {
               System.out.println(z + "is Small  ");
               }
            }        
    }
}

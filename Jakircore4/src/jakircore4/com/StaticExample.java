package jakircore4.com;
public class StaticExample {
   static int x=10;
//    public static void main(String[] args) {
//        StaticExample st = new StaticExample();
//        System.out.println(x);
//   }
}
class A{
    public static void main(String[] args) {
        System.out.println(StaticExample.x);
    }
}

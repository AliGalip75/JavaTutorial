import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("1.sayı:");
        a = scan.nextInt();
        System.out.print("2.sayı:");
        b = scan.nextInt();
        System.out.print("3.sayı:");
        c = scan.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            } else if (c>b) {
                System.out.println("a>c>b");
            }
        } else if (b>a && b>c) {
            if(a>c){
                System.out.println("b>a>c");
            } else if (c>a) {
                System.out.println("b>c>a");
            }
        }else{
            if(a>b){
                System.out.println("c>a>b");
            } else if (b>a) {
                System.out.println("c>b>a");
            }
        }
    }
}

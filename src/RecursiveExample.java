import java.util.Scanner;

public class RecursiveExample {
    static void recursive1(int n,int temp){
        if(n > 0){
            System.out.print(n + " ");
            recursive1(n-5,temp);
        } else{
            recursive2(n,temp);
        }
    }
    static void recursive2(int n,int temp){
        if(temp >= n){
            System.out.print(n + " ");
            recursive2(n + 5,temp);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,temp;
        System.out.print("N:");
        n = scan.nextInt();
        temp = n;
        recursive1(n,temp);
    }
}

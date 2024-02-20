import java.util.Scanner;
public class LoopAssignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,total = 0;
        do{
            System.out.print("Bir sayı gir:");
            num = scan.nextInt();
            if(num%4 == 0){
                total += num;
            }
        }while(num%2 != 1);
        System.out.println("Sonuç:" + total);
    }
}

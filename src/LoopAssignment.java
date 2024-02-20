import java.util.Scanner;

public class LoopAssignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,total=0,control=0;
        double average;
        System.out.print("Bir sayı gir:");
        num = scan.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i%12 == 0){
                total += i;
                control++;
            }
        }
        average = (double) total /control;
        System.out.println("Ortalama:" + average);
    }
}

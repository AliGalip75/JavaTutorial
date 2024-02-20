import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,i=1,num,enB = 0,enK = 0;
        System.out.print("Kaç sayı gireceksiniz:");
        n = scan.nextInt();
        while(n>=i){
            System.out.print(i + ".sayıyı gir:");
            num = scan.nextInt();
            if(i == 1){
                enB = num;
                enK = num;
            }
            if(num>enB){
                enB = num;
            }
            if(num<enK){
                enK = num;
            }
            i++;
        }
        System.out.println("En büyük:" + enB);
        System.out.println("En küçük:" + enK);
    }
}

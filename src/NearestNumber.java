import java.util.Scanner;

public class NearestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı gir:");
        int num = scan.nextInt();
        int diff = 9999;
        int under,above;
        int[] list = {32,67,-45,13,6,72};
        for(int i:list){
            if(diff > i - num && (i - num) > 0){
                diff = (i - num);
            }
        }
        above = diff + num;
        System.out.println("Girilen sayıdan daha büyük olan ve en yakın eleman:" + above);
        diff = 9999;
        for(int i:list){
            if (diff > (num - i) && (num - i) > 0) {
                diff = (num - i);
            }
        }
        under = num - diff;
        System.out.println("Girilen sayıdan daha küçük olan ve en yakın eleman:" + under);

    }
}

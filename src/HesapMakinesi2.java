import java.util.*;
public class HesapMakinesi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,select;
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem seç:");
        select = scan.nextInt();
        System.out.print("ilk sayı:");
        num1 = scan.nextInt();
        System.out.print("İkinci sayi:");
        num2 = scan.nextInt();
        switch (select){
            case 1:
                System.out.print("num1 + num2 : " + (num1 + num2));
                break;
            case 2:
                System.out.print("num1 - num2 : " + (num1 - num2));
                break;
            case 3:
                System.out.print("num1 * num2 : " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.print("num1 / num2 : " + (num1 / num2));
                }
                else{
                    System.out.print("Hiçbir sayı 0'a bölünemez");
                }
                break;
        }
    }
}

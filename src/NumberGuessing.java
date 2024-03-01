import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = (int)(Math.random()*100);
        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWrong = false;
        boolean isWin = false;
        int[] wrong = new int[5];
        while (right < 5){
            System.out.print("Lütfen bir sayı gir:");
            selected = scan.nextInt();
            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz!");
                if(isWrong){
                    System.out.println("Çok fazla hatalı giriş yaptınız,yeni tahmin hakkınız:" + (5 - ++right));
                }else{
                    System.out.println("Hatalı giriş yaptınız,birdaha yapmanız halinde tahmin hakınız eksilecektir!");
                    isWrong = true;
                }
                continue;
            }
            if(selected == num){
                System.out.println("Tebrikler!");
                isWin = true;
                break;
            }else{
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı sayı girdiniz!");
                if(selected > num){
                    System.out.println(selected + " Sayısı gizli sayıdan büyük!");
                }else{
                    System.out.println(selected + " Sayısı gizli sayıdan küçük!");
                }
            }
            System.out.println("Kalan hakkınız:" + (5 - right));

        }
        if(!isWin){
            System.out.println("Kaybettiniz!");
            System.out.println("Hatalı girişleriniz:" + Arrays.toString(wrong));
        }
    }
}

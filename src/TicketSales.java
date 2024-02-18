import java.util.*;
public class TicketSales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance,age,travelType;
        double lastPrice = 0,firstPrice,secondPrice = 0;
        System.out.print("Lütfen mesafeyi km cinsinden giriniz:");
        distance = scan.nextInt();
        System.out.print("Lütfen yaşınızı giriniz:");
        age = scan.nextInt();
        System.out.print("Yolculuk tipini seçiniz(1=>Tek yön,2=>Çift yön):");
        travelType = scan.nextInt();
        if(age>0 && distance>0 && (travelType==1 || travelType==2)){
            firstPrice = 0.10 * distance;
            if(age<12){
                secondPrice = firstPrice * 0.50;
            } else if (age<=24) {
                secondPrice = firstPrice * 0.90;
            }else if(age>=65){
                secondPrice = firstPrice * 0.70;
            }else{
                secondPrice = firstPrice; //24-65 yaş arası kişiler için indirim yok
            }
            if(travelType == 2){
                lastPrice = (secondPrice*0.80) * 2;
            }else{
                lastPrice = secondPrice;
            }
            System.out.println("Toplam Tutar:" + lastPrice + " TL");
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}

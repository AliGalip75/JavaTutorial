import java.util.*;
public class KdvHesapla {
    public static void main(String[] args) {
        double fiyat,kdv;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fiyatı giriniz:");
        fiyat = scan.nextDouble();
        if(fiyat>0 && fiyat<1000){
            kdv = 0.18;
            double yeniFiyat = fiyat + fiyat*kdv;
            System.out.println("Kdv'li fiyat:" + yeniFiyat);
        } else if (fiyat>=1000) {
            kdv = 0.08;
            double yeniFiyat = fiyat + fiyat*kdv;
            System.out.println("Kdv'li fiyat:" + yeniFiyat);
        }
        else {
            System.out.println("Yanlış giriş yaptınız");
        }
    }
    /**
     * @author Ali Galip Yetiş
     */
}

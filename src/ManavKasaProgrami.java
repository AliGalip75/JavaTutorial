import java.util.*;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double toplam,muz,patlican,armut,elma,domates;
        System.out.print("Kaç kg muz:");
        muz = scan.nextDouble();
        System.out.print("Kaç kg patlıcan:");
        patlican = scan.nextDouble();
        System.out.print("Kaç kg armut:");
        armut = scan.nextDouble();
        System.out.print("Kaç kg elma:");
        elma = scan.nextDouble();
        System.out.print("Kaç kg domates:");
        domates = scan.nextDouble();
        toplam = muz*0.95 + patlican*5.0 + armut*2.14 + elma*3.67 + domates*1.11;
        System.out.println("Toplam ödenecek tutar:" + toplam);
    }
    /**
     * @author Ali Galip Yetiş
     */
}

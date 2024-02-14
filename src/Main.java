import java.util.*;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,tarih;
        Scanner scan = new Scanner(System.in);
        System.out.println("Turkce notunu gir:");
        turkce = scan.nextInt();
        System.out.println("mat notunu gir:");
        mat = scan.nextInt();
        System.out.println("fizik notunu gir:");
        fizik = scan.nextInt();
        System.out.println("kimya notunu gir:");
        kimya = scan.nextInt();
        System.out.println("muzik notunu gir:");
        muzik = scan.nextInt();
        System.out.println("tarih notunu gir:");
        tarih = scan.nextInt();
        int toplam = mat + turkce + tarih + muzik + kimya + fizik;
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız:" + ortalama);
        String sonuc = ortalama > 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);
        /**
         * @author Ali Galip Yetiş
         */
    }
}
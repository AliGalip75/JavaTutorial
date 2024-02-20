import java.util.*;
public class VucutKitleİndeksiHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy,vki;
        int kilo;
        System.out.print("Kilonuzu giriniz:");
        kilo = scan.nextInt();
        System.out.print("Boyunuzu giriniz(metre):");
        boy = scan.nextDouble();
        vki = kilo / (boy*boy);
        System.out.print("Vücut kitle indexi:" + vki);
    }
}

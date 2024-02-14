import java.util.*;
public class DairedeAlanVeCevre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14;
        double r,alpha,cevre,alan;
        System.out.print("Yarıçap değerini gir:");
        r = scan.nextDouble();
        System.out.print("Dilimin açısını gir:");
        alpha = scan.nextDouble();
        cevre = 2 * PI * r;
        alan = PI * r * r;
        System.out.println("Dairenin çevresi:" + cevre + "\nDairenin alanı:" + alan);
    }
}

import java.util.*;
public class Taksimetre {
    public static void main(String[] args) {
        double km,tutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("kilometre değerini gir:");
        km = scan.nextDouble();
        tutar = 2.20 * km + 10;
        if(tutar<=20){
            System.out.println("Ödenecek tutar: 20 TL");
        } else {
            System.out.println("Ödenecek tutar:" + tutar + " TL");
        }
    }
    /**
     * @author Ali Galip Yetiş
     */
}

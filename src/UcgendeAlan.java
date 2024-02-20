import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class UcgendeAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kenar1,kenar2,kenar3,cevre;
        double alan,u;
        System.out.print("1.Kenar:");
        kenar1 = scan.nextInt();
        System.out.print("2.kenar:");
        kenar2 = scan.nextInt();
        System.out.print("3.Kenar:");
        kenar3 = scan.nextInt();
        cevre = (kenar1 + kenar2 + kenar3);
        u = cevre/2.0;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.print("üçgenin alanı:" + alan);
    }
    /**
     * @author Ali Galip Yetiş
     */

}

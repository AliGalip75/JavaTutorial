import java.util.*;
public class PassingStatus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int turkce,fizik,mat,kimya,muzik,sum=0;
        double avarage;
        System.out.println("fizik notu:");
        fizik = scan.nextInt();
        System.out.println("Turkçe notu:");
        turkce = scan.nextInt();
        System.out.println("Matematik notu:");
        mat = scan.nextInt();
        System.out.println("Kimya notu:");
        kimya = scan.nextInt();
        System.out.println("Müzik notu:");
        muzik = scan.nextInt();
        if(turkce<=100 && turkce>=0){
            sum += turkce;
        }
        if(mat<=100 && mat>=0){
            sum += mat;
        }
        if(fizik<=100 && fizik>=0){
            sum += fizik;
        }
        if(kimya<=100 && kimya>=0){
            sum += kimya;
        }
        if(muzik<=100 && muzik>=0){
            sum += muzik;
        }
        avarage = sum/5.0;
        System.out.println("Ortalama:" + avarage);
        if(avarage < 55){
            System.out.println("Kaldınız");
        }
        else{
            System.out.println("Geçtiniz");
        }
    }
}

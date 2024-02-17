import java.awt.*;
import java.util.*;
public class UserLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName,userPassword;
        System.out.print("Kullanıcı adınızı giriniz:");
        userName = scan.nextLine();
        System.out.print("Şifrenizi giriniz:");
        userPassword = scan.nextLine();
        if(userName.equals("patika") && userPassword.equals("java123")){
            System.out.println("Başarıyla giriş yapıldı.");
        }
        else{
            System.out.println("Hatalı giriş yaptınız,şifrenizi sıfırlamak istiyor musunuz?");
            char ch;
            ch = scan.next().charAt(0);
            if(ch == 'e' || ch == 'E'){
                System.out.print("Yeni şifrenizi girin:");
                String newUserPassword;
                newUserPassword = scan.next();
                if(newUserPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else{
                System.out.println("Çıkış yapıldı.");
            }
        }
    }
}

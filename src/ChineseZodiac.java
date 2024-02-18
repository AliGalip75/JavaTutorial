import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dateOfBirth;
        String animal = "";
        System.out.print("Doğum tarihini gir:");
        dateOfBirth = scan.nextInt();
        if(dateOfBirth%12 == 0){
            animal = "Maymun";
        } else if (dateOfBirth%12 == 1) {
            animal = "Horoz";
        } else if (dateOfBirth%12 == 2) {
            animal = "Köpek";
        } else if (dateOfBirth%12 == 3) {
            animal = "Domuz";
        } else if (dateOfBirth%12 == 4) {
            animal = "Fare";
        } else if (dateOfBirth%12 == 5) {
            animal = "Öküz";
        } else if (dateOfBirth%12 == 6) {
            animal = "Kaplan";
        } else if (dateOfBirth%12 == 7) {
            animal = "Tavşan";
        } else if (dateOfBirth%12 == 8) {
            animal = "Ejderha";
        } else if (dateOfBirth%12 == 9) {
            animal = "Yılan";
        } else if (dateOfBirth%12 == 10) {
            animal = "At";
        } else if (dateOfBirth%12 == 11) {
            animal = "Koyun";
        }
        System.out.println("Çin zodyağı burcunuz:" + animal);
    }
}

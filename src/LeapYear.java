import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.print("Yıl:");
        year = scan.nextInt();
        if(year%100 == 0){
            if(year%400 == 0){
                System.out.println(year + " Artık yıl");
            }else{
                System.out.println(year + " Artık yıl değil");
            }
        }else{
            if(year%4 == 0){
                System.out.println(year + " Artık yıl");
            }else{
                System.out.println(year + " Artık yıl değil");
            }
        }

    }
}

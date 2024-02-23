import java.util.Scanner;

public class CalculatorWithMethods {
    static void menu(){
        System.out.println("0- Çıkış\n1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi" +
                "\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Mod Alma\n7- Dikdörtgen Alan ve Çevre Hesabı");
    }
    static int sum(int a,int b){
        return a + b;
    }
    static int subtraction(int a,int b){
        return a - b;
    }
    static int multiplication(int a,int b){
        return a*b;
    }
    static double division(int a,int b){
        if(b == 0){
            return 0;
        }
        return (double)a/b;

    }
    static double pow(int a,int b){
        return Math.pow(a,b);
    }
    static int mod(int a,int b){
        return a % b;
    }
    static int areaAndPerimeter(int a,int b){
        return 2*a + 2*b;
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int num1,num2,select;
        while (true) {
            menu();
            System.out.print("Yapacağınız işlemi seçiniz:");
            select = scan.nextInt();
            if (select == 0) break;
            System.out.print("1.sayı:");
            num1 = scan.nextInt();
            System.out.print("2.sayı:");
            num2 = scan.nextInt();
            switch (select){
                case 1:
                    System.out.println(sum(num1,num2));
                    break;
                case 2:
                    System.out.println(subtraction(num1,num2));
                    break;
                case 3:
                    System.out.println(multiplication(num1,num2));
                    break;
                case 4:
                    if(division(num1,num2) == 0){
                        System.out.println("İkinci sayı 0 olamaz!");
                    }else{
                        System.out.println(division(num1,num2));
                    }
                    break;
                case 5:
                    System.out.println(pow(num1,num2));
                    break;
                case 6:
                    System.out.println(mod(num1,num2));
                    break;
                case 7:
                    System.out.println(areaAndPerimeter(num1,num2));
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class RecursiveMethod {
    static String isPalindrom(int num){
        int temp = num;
        String reverseNumber = "";
        while(temp != 0){
            int lastNumber = temp % 10;
            reverseNumber += (lastNumber + "");
            temp = temp / 10;
        }
        return reverseNumber;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tersi alınacak sayıyı gir:");
        int num = scan.nextInt();
        System.out.print(isPalindrom(num));
    }
}

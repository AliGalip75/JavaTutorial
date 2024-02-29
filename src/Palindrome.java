import java.util.Scanner;

public class Palindrome {
    static boolean isPalindromic(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        if(reverse.equals(word)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime gir:");
        String word = scan.next();
        if(isPalindromic(word)){
            System.out.println("Kelime palindromic");
        }else{
            System.out.println("Kelime palindromc değil");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin uzunluğunu gir:");
        int len = scan.nextInt();
        int[] list = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Dizinin " + (i+1) + ". Elemanını gir:" );
            list[i] = scan.nextInt();
        }
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if(list[j-1] > list[j]){
                    int temp =list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}

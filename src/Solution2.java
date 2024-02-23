import java.util.*;
public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=1;i<=q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double sum =0;
            for(int j=0;j<n;j++){
                sum = sum+Math.pow(2, j)*b;
                int value = (int)(a+sum);
                System.out.print(value+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

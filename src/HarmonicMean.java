import java.util.Arrays;

public class HarmonicMean {
    static double arrayFunc(int[] arr){
        double sum = 0.0;
        for(int i:arr){
            sum += (double) 1 / i;
        }
        return arr.length / sum;
    }
    public static void main(String[] args) {
        int[] array = {10,4,9,12,7};
        System.out.println(arrayFunc(array));
    }
}

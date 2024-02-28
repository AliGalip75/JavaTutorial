import java.util.Arrays;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {
        int[] arr = {5,10,20,5,10,30,5,20,5,10,30};
        Arrays.sort(arr);//5,5,5,5,10,10,10,20,20,30,30
        for (int i = 0; i < arr.length; i++) {
            int repeatedNum = 0;
            if(i == 0){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        repeatedNum++;
                    }
                }
                System.out.println(arr[i] + " Sayısı " + repeatedNum + " kere tekrar edildi.");
            }else if(arr[i] != arr[i-1]){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        repeatedNum++;
                    }
                }
                System.out.println(arr[i] + " Sayısı " + repeatedNum + " kere tekrar edildi.");
            }
        }
    }
}

import java.util.Arrays;

public class RepeatedNumbers {
    static boolean isFind(int[] arr,int value){
        for (int i:arr) {
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,14,5,4,14,9,8,4,8,1};
        int[] dublicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(i!=j && list[i]%2==0 && list[i] == list[j]){
                    if((!isFind(dublicate,list[i]))){
                        dublicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("[ ");
        for(int value:dublicate){
            if(value != 0){
                System.out.print(value + " ");
            }else{
                break;
            }
        }
        System.out.print("]");
    }
}

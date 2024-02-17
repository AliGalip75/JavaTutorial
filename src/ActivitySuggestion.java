import java.util.*;
public class ActivitySuggestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklık:");
        heat = scan.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsin");
        } else if (heat<=25) {
            if(heat<=10){
                System.out.println("sinemaya gidebilirsin");
            }
            if(heat>15){
                System.out.println("Pikniğe gidebilirsin");
            }if(heat>10 && heat<=15){
                System.out.println("Hem pikniğe hem de sinemaya gidebilirsin");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}

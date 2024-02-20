import java.util.*;
public class WhichZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month,zodiac = "";
        int day;
        boolean isError = false;
        System.out.print("hangi ay:");
        month = scan.next();
        System.out.print("kaçı:");
        day= scan.nextInt();
        if(month.equals("ocak")){
            if(day>=1 && day<=31){
                if(day<22){
                    zodiac = "oğlak";
                }else{
                    zodiac = "kova";
                }
            }else{
                isError = true;
            }
        } else if (month.equals("şubat")) {
            if(day>=1 && day<=29){
                if(day<20){
                    zodiac = "kova";
                }else{
                    zodiac = "Balık";
                }
            }else{
                isError = true;
            }
        }//Devamını yazmadım

        System.out.println("Burcun:" + zodiac);
        if(isError){
            System.out.println("Yanlış giriş yaptınız.");
        }
    }
}

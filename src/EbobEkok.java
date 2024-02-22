import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,i=1,j=1,ebob=1,ekok=1;
        System.out.print("1.sayı:");
        num1 = scan.nextInt();
        System.out.print("2.sayı:");
        num2 = scan.nextInt();
        if(num1<num2){
            while (i<=num1){
                if(num1%i==0 && num2%i==0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob:" + ebob);
            while(j<=num1*num2){
                if(j%num1==0 && j%num2==0){
                    ekok = j;
                    break;
                }
                j++;
            }
            System.out.println("Ekok:" + ekok);
        }
        else if(num1>num2){
            while (i<=num2){
                if(num1%i==0 && num2%i==0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob:" + ebob);
            while(j<=num1*num2){
                if(j%num1==0 && j%num2==0){
                    ekok = j;
                    break;
                }
                j++;
            }
            System.out.println("Ekok:" + ekok);
        }
    }
}

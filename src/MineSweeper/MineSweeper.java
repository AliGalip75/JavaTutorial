package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public int row;
    public int column;

    public MineSweeper(int row,int column){
        this.row = row;
        this.column = column;
    }
    public String[][] createMatris(){ //rastgele mayınlar yerleştirilmiş matris oluşturan metot.
        String[][] matris = new String[this.row][this.column];
        int mineCount = (this.row*this.column)/4;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                matris[i][j] = "-";
            }
        }
        Random rand = new Random();
        for (int i = 0; i < mineCount; i++) {
            int randomRow = rand.nextInt(0,this.row);
            int randomCol = rand.nextInt(0,this.column);

            while (matris[randomRow][randomCol].equals("*")){
                randomRow = rand.nextInt(this.row);
                randomCol = rand.nextInt(this.column);
            }
            matris[randomRow][randomCol] = "*";
        }

        return matris;
    }
    public void printMatris(String[][] matris){ //matrisi yazdır
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(matris[i][j] + "       ");
            }
            System.out.print("\n\n\n");
        }
    }
    public String[][] createEmptyMatris(){ //kullanıcının göreceği matrisin ilk halini oluştur
        String[][] matris = new String[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                matris[i][j] = "-";
            }
        }
        return matris;
    }
    public String countMine(String[][] matris,int row,int col){ //kullanıcının seçtiği indexin etrafındaki mayın sayısını hesapla
        int countMine = 0;
        for (int i = Math.max(0,row-1); i <= Math.min(row+1,matris.length-1); i++) {
            for (int j = Math.max(0,col-1); j <= Math.min(col+1,matris[0].length-1) ; j++) {
                if(matris[i][j].equals("*")){
                    countMine += 1;
                }
            }
        }
        return String.valueOf(countMine);
    }
    public void run(){
        String[][] matris = createMatris();//ana matris
        int row,col;
        printMatris(matris);//ana matrisi yazdır
        System.out.println("==========================\n\n");
        Scanner scan = new Scanner(System.in);
        String[][] emptyMatris = createEmptyMatris();//oyuncunun gördüğü matris
        do{
            printMatris(emptyMatris);//oyuncunun gördüğü matrisi her işlemden sonra yazdır
            System.out.print("Kaçıncı satır:");
            row = scan.nextInt();
            System.out.print("Kaçıncı sütun:");
            col = scan.nextInt();
            if(matris[row][col].equals("*")){
                System.out.println("GAME OVER!");
                break;
            }else{
                emptyMatris[row][col] = countMine(matris,row,col);
            }
        }while(!(matris[row][col].equals("*")));

    }

}

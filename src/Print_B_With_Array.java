import java.util.Arrays;
public class Print_B_With_Array {
    public static void main(String[] args) {
        String[][] letter = new String[7][3];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if(j == 0){
                    letter[i][j] = "* ";
                } else if ((i==0 && j==1) || (i==3 && j==1) || (i==6 && j==1)) {
                    letter[i][j] = "* ";
                } else if ((j==2 && i==1) || (j==2 && i==2) || (j==2 & i==4) || (j==2 && i==5)) {
                    letter[i][j] = "* ";
                }else{
                    letter[i][j] = " ";
                }
            }
        }
        for (String[] row:letter){
            for(String col:row){
                System.out.print(col);
            }
            System.out.print("\n");
        }

    }
}

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matrsinin satır sayısı:");
        int row = scan.nextInt();
        System.out.print("Matrisin sütun sayısı:");
        int col = scan.nextInt();
        int[][] matris = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] = ");
                matris[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matris:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        System.out.println("Transpozu:");
        int[][] matris2 = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matris2[j][i] = matris[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matris2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

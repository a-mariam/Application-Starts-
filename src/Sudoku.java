import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    public static void sudokuGame(){
        Scanner scanner = new Scanner(System.in);
        int [][] blocks = new int[6][6];
        for (int row = 0; row < 6;row++){
            for (int column = 0; column < 6; column++){
                System.out.print("Enter a number between 1 and 9: ");
                blocks[row][column] += scanner.nextInt();

            }
            System.out.println(" ");
           // System.out.println(Arrays.toString(blocks));
        }
    }

    public static void main(String[] args) {
        sudokuGame();
    }
}

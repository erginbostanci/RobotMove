import java.util.Random;

public class CodeChallenge_1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        int[][] theGrid = new int[10][10];

        //Creating the Grid
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                theGrid[i][j] = 0;
            }
        }

        //Creating the Blocks
        int counter = 0;
        while (counter < 25) {
            Random rand = new Random();
            theGrid[rand.nextInt(9)][rand.nextInt(9)] = 1;
            counter++;
        }
        //Printing the Grid to see
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (theGrid[i][j] ==1){
                    System.out.print(ANSI_YELLOW + theGrid[i][j] + "   " + ANSI_RESET );
                } else
                System.out.print(theGrid[i][j] + "   ");
            }
            System.out.println("\n");
        }

        String move= "";
        int sum = 0;
        int row = 0;
        int col = 0;

            //Move Function

                while(sum < 18) {

                    if (row<10){

                        if (col<10){

                            if (theGrid[row][col] != 0 && col!=9) {
                                move = "R";
                                col++;
                            } else if(theGrid[row][col] == 0 && row!=9) {
                                row++;
                                move = "D";
                            }
                        }
                        System.out.print(move);
                }
                    sum = row + col;
            }
    }
}
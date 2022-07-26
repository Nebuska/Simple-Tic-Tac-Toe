package tictactoe;

public class Main {
    public static void main(String[] args) {
        char[][] gameSlot = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X','O','X'}};
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(gameSlot[line][column]);
            }
            System.out.println();
        }
    }
}

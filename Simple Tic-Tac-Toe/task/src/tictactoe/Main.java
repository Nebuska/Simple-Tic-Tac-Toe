package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> ");
        String gameSlot = scanner.next();

        if (gameSlot.length() != 9 || !gameSlot.replaceAll("X|O|_","").equals("")) {
            System.out.println(gameSlot + "isn't in right format!");
            return;
        }

        for (int line = -1; line < 4; line++) {
            if (line == -1 || line == 3) {
                System.out.println("---------");
                continue;
            }
            for (int column = -1; column < 4; column++) {
                if (column == -1 || column == 3) {
                    System.out.print("| ");
                    continue;
                }
                System.out.printf("%s%s",gameSlot.charAt(line*3+column), ' ');
            }
            System.out.println();
        }
    }
}

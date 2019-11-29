import java.util.Scanner;

class Game {

    private static final int TWENTY_MATCHES = 20;

    int quantityOfMatches;

    Game() {
        this.quantityOfMatches = TWENTY_MATCHES;
    }

    private Scanner scanner = new Scanner(System.in);

    private int readPlayersMove() {
        if (scanner.hasNextInt()) {
            int matchesToDelete = scanner.nextInt();
            if (matchesToDelete <= 3 && matchesToDelete >= 1) {
                return matchesToDelete;
            }
            else {
                MessageOutput.printWrongQuantity();
                return 0;
            }
        } else {
            MessageOutput.printWrongValue();
            scanner.next();
            return 0;
        }
    }

    void gameProcess(Game game) {
        int matchesToDelete;

        MessageOutput.declareBeginOfGame();
        MessageOutput.declareRemainingMatches(quantityOfMatches);
        ComputerLogic.makeFirstMove(game);
        MessageOutput.declareRemainingMatches(quantityOfMatches);

        while (quantityOfMatches != 1){
            MessageOutput.declarePlayersTurn();
            matchesToDelete = readPlayersMove();
            while (matchesToDelete == 0) {
                MessageOutput.declareRemainingMatches(quantityOfMatches);
                MessageOutput.declarePlayersTurn();
                matchesToDelete = readPlayersMove();
            }
            quantityOfMatches -= matchesToDelete;
            MessageOutput.declareRemainingMatches(quantityOfMatches);
            ComputerLogic.makeNextMove(game);
            MessageOutput.declareRemainingMatches(quantityOfMatches);
        }
        MessageOutput.declareWinner();
        scanner.close();
    }
}

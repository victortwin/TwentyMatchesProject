class ComputerLogic {

    private static final int THREE_MATCHES = 3;
    private static final int TWO_MATCHES = 2;
    private static final int ONE_MATCH = 1;

    static void makeFirstMove(Game game) {
        game.quantityOfMatches -= THREE_MATCHES;
        MessageOutput.declareSelectedMatches(THREE_MATCHES);
        MessageOutput.printNewLine();
    }

    static void makeNextMove(Game game) {
        if (game.quantityOfMatches % 2 != 0) {
            game.quantityOfMatches -= TWO_MATCHES;
            MessageOutput.declareSelectedMatches(TWO_MATCHES);
        } else if (game.quantityOfMatches % 4 == 0) {
            game.quantityOfMatches -= THREE_MATCHES;
            MessageOutput.declareSelectedMatches(THREE_MATCHES);
        } else {
            game.quantityOfMatches -= ONE_MATCH;
            MessageOutput.declareSelectedMatches(ONE_MATCH);
        }
        MessageOutput.printNewLine();
    }
}

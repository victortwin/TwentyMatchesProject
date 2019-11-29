class MessageOutput {

    static void declareBeginOfGame() {
        System.out.println("Игра началась!");
    }

    static void declareRemainingMatches(int quantity) {
        switch (quantity) {
            case 4:
            case 3:
            case 2: {
                System.out.printf("На столе %d спички. ", quantity);
                break;
            }
            case 1: {
                System.out.println("Для игрока осталась одна спичка.");
                break;
            }
            default: {
                System.out.printf("На столе %d спичек. ", quantity);
            }
        }
    }

    static void declarePlayersTurn() {
        System.out.print("\nИгрок делает ход. Введите количество спичек: ");
    }

    static void declareSelectedMatches(int matches) {
        System.out.print("\nКоличество выбранных компьютером спичек = " + matches + ".");
    }

    static void declareWinner() {
        System.out.println("Игра окончена, компьютер выиграл!");
    }
    static void printWrongValue() {
        System.out.print("Некорректное значение!\n");
    }

    static void printWrongQuantity() {
        System.out.print("Некорректное количество спичек!\n");
    }

    static void printNewLine() {
        System.out.println("");
    }
}

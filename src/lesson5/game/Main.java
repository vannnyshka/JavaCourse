package lesson5.game;

import java.util.Scanner;

public class Main {

    /* Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
    по очереди вводят координаты клетки в которую хотят сделать ход. После
    каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
    Игра продолжается до победы одного из игроков или ничьи*/

    public static char[][] board = new char[3][3];

    public static void main(String[] args) {
        char currentPlayer = 'X';

        initializeBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Игрок " + currentPlayer + ", сделай свой ход (строка, колонка): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (checkMove(row, col)) {
                board[row][col] = currentPlayer;
                printBoard();

                if (isGameOver()) {
                    if (isWin(currentPlayer)) {
                        System.out.println("Игрок " + currentPlayer + " выиграл!");
                    } else {
                        System.out.println("Ничья!");
                    }
                    break;
                }

                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Такой клетки нет. Попробуй еще раз.");
            }
        }

    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }


    public static boolean isGameOver() {
        return isWin('X') || isWin('O') || isBoardFull();
    }

    //Если ничья
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    //Если кто-то выиграл
    public static boolean isWin(char player) {
        // Проверка строк
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Проверка столбцов
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Проверка диагоналей
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }


}





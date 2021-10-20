package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String[][] initBoard(){
        Random random = new Random();

        int boardCollumns = 10;
        int boardRows = 8;
        String[][] board = new String[boardCollumns][boardRows];

        // inits the board
        for (int i = 0; i < boardCollumns; i++) {
            for (int j = 0; j < boardRows; j++) {
                board[i][j] = "[ ]";
            }
            for (int l = 0; l < 20; l++) {
                int randomCollumn = random.nextInt(boardCollumns);
                int randomRow = random.nextInt(boardRows);
                Integer randomMoney = random.nextInt(10);
                if (randomMoney != 0) {
                    board[randomCollumn][randomRow] = "[" + Integer.toString(randomMoney) + "]";
                }
            }
        }
        return board;
    }

    public static void gameLoop(){
        Scanner input = new Scanner(System.in);

        int userScore = 0;
        System.out.println("!!TREASURE HUNT!!");
        System.out.println("");
        while (true) {
            System.out.println("Enter a guess: (in the form (x,y) x<=9 y<=7");
            String userGuess = input.nextLine();
            int userGuessX = Integer.parseInt(userGuess.substring(1));
            int userGuessY = Integer.parseInt(userGuess.substring(3));
            if()
        }
    }

    public static void main(String[] args) {
        initBoard();
        gameLoop();
    }
}

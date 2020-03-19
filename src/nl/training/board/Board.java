package nl.training.board;

import java.util.ArrayList;

class Board {
    int boardPosities;
    int dobbelsteen;
    String spelerNaam;
    ArrayList<Board> board = new ArrayList<Board>();

    Board() {

    }

    Board(int dobbelsteen) {
        this.boardPosities = dobbelsteen;
    }

    void maakBoard() {

        board.add(new Board(64));
        System.out.println(board.get(0).boardPosities);

        for (int i = 0; i <= 64; i++) {
            board.add(new Board(i));
        }

        for (Board velden : board) {
            System.out.println(velden.boardPosities);
        }

    }
}
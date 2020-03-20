package nl.training.board;

import java.util.ArrayList;

class Board {
    int boardPosities;
    int dobbelsteen;
    String specialePosities;
    String spelerNaam;


    Board(int boardPosities, String positie) {
        this.boardPosities = boardPosities;
        this.specialePosities = positie;
    }

    Board(int dobbelsteen) {
        this.boardPosities = dobbelsteen;
    }

    Board() {

    }

    void maakBoardPositieNummers() {
        ArrayList<Board> board = new ArrayList<Board>();
        for (int i = 0; i <= 64; i++) {
            if (i == 5) board.add(new Board(i, "Brug"));
            if (i == 19) board.add(new Board(i, "Herberg"));
            if (i == 31) board.add(new Board(i, "Put"));
            if (i == 42) board.add(new Board(i, "doolhof"));
            if (i == 52) board.add(new Board(i, "gevangenis"));
            if (i == 58) board.add(new Board(i, "dood"));
            if (i == 63) board.add(new Board(i, "einde"));
            board.add(new Board(i, ""));

        }
        toonGanzenBord(board);
    }

    protected void toonGanzenBord(ArrayList<Board> board) {
        for (Board checkposities : board) {
            System.out.println(checkposities.boardPosities+ " " + checkposities.specialePosities);
        }
    }
}
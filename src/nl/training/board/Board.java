package nl.training.board;

import java.util.ArrayList;
/*
@Todo: Van af hier is oude code met de werkende ArrayList.
*/
class Board {

    ArrayList<Vakje> boardPosities = new ArrayList<>();

    Board() {
        maakBoardPositieNummers();
    }

    void Brug() {
        // Hier worden de regels van de brug bepaald.
    }

    void Herberg() {
        // Hier worden de regels van de herberg bepaald.
    }

    void Put() {
        // Hier worden de regels van de Put bepaald.
    }

    void Doolhof() {
        // Hier worden de regels van de Doolhof bepaald.
    }
    void Gevangenis() {
        // Hier worden de regels van de Gevangenis bepaald.
    }

    void Dood() {
        // Hier worden de regels van de Dood bepaald.
    }

    void Einde() {
        // Hier worden de regels van de EInde bepaald.
    }

    void maakBoardPositieNummers() {
        for (int i = 0; i <= 64; i++) {
            if (i == 5)  boardPosities.add(new Vakje(i, "Brug"));
            else if (i == 19) boardPosities.add(new Vakje(i, "Herberg"));
            else if (i == 31) boardPosities.add(new Vakje(i, "Put"));
            else if (i == 42) boardPosities.add(new Vakje(i, "doolhof"));
            else if (i == 52) boardPosities.add(new Vakje(i, "gevangenis"));
            else if (i == 58) boardPosities.add(new Vakje(i, "dood"));
            else if (i == 63) boardPosities.add(new Vakje(i, "einde"));
            else boardPosities.add(new Vakje(i, ""));
        }
        toonGanzenBord();
    }

    void toonGanzenBord() {
        for (Vakje checkposities : boardPosities) {
            System.out.println(checkposities.positie+ " " + checkposities.specialePositie);
        }
    }
}

class Vakje {

    int positie;
    String specialePositie;

    Vakje(int positie, String specialePositie) {
        this.positie = positie;
        this.specialePositie= specialePositie;
    }
}

/*
@Todo: Van af hier is oude code met de werkende ArrayList.

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

 */
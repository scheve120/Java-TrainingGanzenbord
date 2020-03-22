package nl.training.board;

import java.util.ArrayList;
import java.util.Scanner;

class Speler {
    String spelerNaam;
    String actie;
    int positieSpeler = 0;

    void spelerAkties() {

        switch (inputController().nextLine()) {
            case "Test":
                System.out.println("Je test switch werkt!!");
                break;
            case "David":
                System.out.println("Hallo " + inputController() + " De basis is goed!");
                break;
            default:
                System.out.println("Deze switch met user input werkt nog niet 100% Of je hebt niks ingevult klojo!!");
        }
    }

    Scanner inputController() {
        Scanner inputController = new Scanner(System.in);
        return inputController;
    }
    void spelerPositie() {
        // argument Dobbelsteen

        // Argument speler positie op.
        Board spelerPositieOpBord = new Board();
        ArrayList<Board> board = new ArrayList<>();

    }
}

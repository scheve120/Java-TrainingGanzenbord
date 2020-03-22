package nl.training.board;

import java.util.Scanner;

public class Spel {
    Board bord = new Board();
    Dobbelsteen dobbelsteen = new Dobbelsteen();
    Speler speler1 = new Speler(); // Met meerdere spelers kan dit een array worden

    void SpelerPositie(int worpen) {
        System.out.println("Even kijken wat voor waarde hier in zit!! Strings of primitives?   " + speler1.positieSpeler += + worpen);
        System.out.println(speler1 + "Gooit (" + dobbelsteen.dobbelsteen1+ ") (" + dobbelsteen.dobbelsteen2 + ") Totaal = (" + dobbelsteen.gooiMetTweeDobbelstenen() + ")");
        System.out.println(bord.boardPosities.get(speler1.positieSpeler).positie);
//        switch ()
    }

    void spelen() {
        // uitvragen aantal spelers / naam speler..
        // while loop bedenken en daarbinnen roep je de methode speelRonde()
        speelRonde();
    }

    private void speelRonde() { // indexe uit spelersarray meegeeft.
        // gooit
        int worpen = dobbelsteen.gooiMetTweeDobbelstenen();
        boolean stop = false;
        do {
            String sepelerActie = speler1.inputController().nextLine();
            if (sepelerActie.equals("Gooi")) {
                SpelerPositie(worpen);
            } else if (sepelerActie.equals("Stop")) {
                stop = false;
            } else {
                System.out.println("Als je wil stoppen met je zeggen 'Stop' ");
            }
        } while (!stop);

        // naar nieuw plek => positie updaten
        // kijken wat de positie inhoudt
        // eventueel opdracht positie uitvoer

    }
}

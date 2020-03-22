package nl.training.board;

import java.util.Scanner;

public class Spel {
    Board bord = new Board();
    Dobbelsteen dobbelsteen = new Dobbelsteen();
    Speler speler1 = new Speler(); // Met meerdere spelers kan dit een array worden

    void SpelerPositie(int worpen) {
        int dobbelsteen1 = dobbelsteen.dobbelsteen1;
        int dobbelsteen2 = dobbelsteen.dobbelsteen2;
        int totaal = dobbelsteen1+dobbelsteen2;
        int oudePositie = speler1.positieSpeler;
        int spelerPlek = speler1.positieSpeler += + worpen;


        switch (spelerPlek) {
            case 5:
                System.out.println("U staat op brug. U gaat nu verder naar plek 12");
                spelerPlek = bord.Brug();
                break;
            case 19:
                System.out.println("U staat nu op herberg. Sla 1 beurt over!");
                bord.Herberg();
                break;
            case 31:
                System.out.println("U staat op put. Sla 2 beurten over!");
                bord.Put();
                break;
            case 42:
                System.out.println("U staat op doolhof of doornstruik. Ga terug naar 39!");
                bord.Doolhof();
                break;
            case 52:
                System.out.println("U staat nu op gevangenis. Sla 2 beurten over!");
                bord.Gevangenis();
                break;
            case 58:
                System.out.println("U bent dood! Ga terug naar start");
                bord.Dood();
                break;
            case 63:
                bord.Einde(speler1.positieSpeler, totaal);
                break;
            default:
                System.out.println(speler1 + "Gooit (" + dobbelsteen1 + ") (" + dobbelsteen2 + ") Totaal = (" + totaal + ")");
                System.out.println(bord.boardPosities.get(spelerPlek).positie);
        }
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
                SpelerPositie(dobbelsteen.gooiMetTweeDobbelstenen());
            } else if (sepelerActie.equals("Positie")) {
                System.out.println(speler1.positieSpeler);
            }else if (sepelerActie.equals("Stop")) {
                break;
            } else {
                System.out.println("Als je wil stoppen met je zeggen 'Stop' ");
            }
        } while (!stop);

        // naar nieuw plek => positie updaten
        // kijken wat de positie inhoudt
        // eventueel opdracht positie uitvoer
    }
}

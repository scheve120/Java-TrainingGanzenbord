package nl.training.board;

public class Spel {
    Board bord = new Board();
    Dobbelsteen dobbelsteen = new Dobbelsteen();
    Speler speler1 = new Speler(); // Met meerdere spelers kan dit een array worden

    void SpelerPositie() {
//        bord.boardPosities.set(4, "*");
        // Hier wordt de locatie van de spelers bepaald.
        Dobbelsteen gooit = new Dobbelsteen();
//        gooit.maakDobbelsteen();
//        System.out.println("Dobbelsteen 1 = (" + gooit.dobbelsteen1 + ") Dobbelsteen 2 = (" + gooit.dobbelsteen2 + ") Totaal = (" + gooit.totaal + ")");
//        System.out.println(gooit.dobbelsteen2);
    }

    void spelen() {
        // uitvragen aantal spelers / naam speler..
        // while loop bedenken en daarbinnen roep je de methode speelRonde()
        speelRonde();
    }

    private void speelRonde() { // indexe uit spelersarray meegeeft.
        // gooit
        int worpen = dobbelsteen.gooiMetTweeDobbelstenen();

        /*
        System.out.println("gegooid: " + worpen);
//        worpen = 5; // even testen
        speler1.positieSpeler += + worpen;
        System.out.println("sta nu op plek: " + bord.boardPosities.get(speler1.positieSpeler).positie + " " + bord.boardPosities.get(speler1.positieSpeler).specialePositie);
//        worpen = 14; // even testen
        worpen = dobbelsteen.gooiMetTweeDobbelstenen(); // even testen
        speler1.positieSpeler += + worpen;
        System.out.println("gegooid: " + worpen);
        System.out.println("sta nu op plek: " + bord.boardPosities.get(speler1.positieSpeler).positie + " " + bord.boardPosities.get(speler1.positieSpeler).specialePositie);
//        worpen = 1; // even testen
        worpen = dobbelsteen.gooiMetTweeDobbelstenen(); // even testen
        speler1.positieSpeler += + worpen;
        System.out.println("gegooid: " + worpen);
        System.out.println("sta nu op plek: " + bord.boardPosities.get(speler1.positieSpeler).positie + " " + bord.boardPosities.get(speler1.positieSpeler).specialePositie);
        // naar nieuw plek => positie updaten
        // kijken wat de positie inhoudt
        // eventueel opdracht positie uitvoer
         */

        boolean stop = true;
        speler1.inputController();

        do {
            if (speler1.inputController().equals("Gooi")) {
                System.out.println(speler1 + "Gooit " + dobbelsteen.dobbelsteen1+ " " + dobbelsteen.dobbelsteen2);
            } else if (speler1.inputController().equals("Stop")) {
                stop = true;
            } else {
                stop = false;
            }
        } while (stop == true);
    }
}

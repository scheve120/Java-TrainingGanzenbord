package nl.training.board;

import java.util.ArrayList;
import java.util.Random;

public class Dobbelsteen {
    int dobbelsteen1;
    int dobbelsteen2;
    private int totaal;

    int gooiMetTweeDobbelstenen() {

        Random dobbelen = new Random();
        this.dobbelsteen1 = dobbelen.nextInt(6) + 1; // nextInt(6) levert de volgende mogelijkheiden: 0, 1, 2, 3, 4, 5. dus + 1 voor dobbelsteen
        this.dobbelsteen2 = dobbelen.nextInt(6) + 1;
        int totaal = this.dobbelsteen1+this.dobbelsteen2;

        return totaal;
    }
}

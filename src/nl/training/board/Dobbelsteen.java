package nl.training.board;

import java.util.ArrayList;
import java.util.Random;

public class Dobbelsteen {
    int[] steen = {1,2,3,4,5,6};
    void gooiDobbelsteen() {
        Random dobbelen = new Random();
        int gooiSteen1 = dobbelen.nextInt(6);
        int gooiSteen2 = dobbelen.nextInt(6);
    }
}

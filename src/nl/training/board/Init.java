package nl.training.board;


import java.util.concurrent.TimeUnit;

public class Init {
    public static void main(String[] args) throws Exception {
        Board ganzenbord = new Board();
//        ganzenbord.maakBoard();

        Timer stopwatch = new Timer();
        boolean bool = false;
        do {
            if (stopwatch.tijd < 10) {
                System.out.println("Eieren nog niet klaar");

                System.out.println(stopwatch.tijd);
                stopwatch.zetTimer();

                TimeUnit.MILLISECONDS.sleep(100);
                bool = true;
            } else {
                System.out.println("Eieren zijn klaar!! Eetsmakelijk");
                bool = false;
            }
        } while (bool == false);
    }
}
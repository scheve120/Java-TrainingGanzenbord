package nl.training.board;

import java.util.concurrent.TimeUnit;

class Timer {
    int tijd;
    void zetTimer() throws Exception {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i " + i);
            TimeUnit.MILLISECONDS.sleep(100);
            this.tijd = i;
//            return i;
//            TimeUnit.SECONDS.sleep(2);
        }
    }
}


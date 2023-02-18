import lombok.SneakyThrows;

import java.math.BigDecimal;


//use synchronized to prevent any errors and make concurreny 
//because of synchronized two threads cant use it , so when a thread finished the job another starting
public class SimpleThread extends Thread {
    public static BigDecimal resource1 = BigDecimal.valueOf(0);

    public static void add() {
        SimpleThread.resource1 = BigDecimal.valueOf(+1);
    }

    @SneakyThrows
    @Override
    public synchronized void run() {
       add();
       sleep(50);
    }
}

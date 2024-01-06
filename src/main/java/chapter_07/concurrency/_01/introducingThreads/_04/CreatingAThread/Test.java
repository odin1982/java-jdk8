package chapter_07.concurrency._01.introducingThreads._04.CreatingAThread;

import static org.hamcrest.CoreMatchers.startsWith;

public class Test {
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
    }
}

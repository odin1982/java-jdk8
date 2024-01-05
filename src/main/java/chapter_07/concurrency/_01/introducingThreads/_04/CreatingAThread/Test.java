package chapter_07.concurrency._01.introducingThreads._04.CreatingAThread;

public class Test {
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
    }
}

package chapter_07.concurrency._01.introducingThreads._04.CreatingAThread;

public class ReadInventoryThread extends Thread{
    public void run(){
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}

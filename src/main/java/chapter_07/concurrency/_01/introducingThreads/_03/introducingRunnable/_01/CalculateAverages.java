package chapter_07.concurrency._01.introducingThreads._03.introducingRunnable._01;

public class CalculateAverages implements Runnable{
    private double[] scores;

    public CalculateAverages(double[] scores) {
        this.scores = scores;
    }

    @Override
    public void run() {
        //Define work here that uses the score object
    }
}

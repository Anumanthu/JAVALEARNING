package src.javaAdvanced;

public class MultiThreading extends Thread {
    public static int i = 0;

    public static void main(String[] args) {
        MultiThreading mth = new MultiThreading();
        mth.start();
        MultiThreading mth1 = new MultiThreading();
        mth1.start();
    }

    public void run() {
        System.out.println("count == " + i);
    }

}

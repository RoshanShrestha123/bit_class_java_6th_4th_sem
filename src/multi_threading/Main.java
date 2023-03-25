package multi_threading;

public class Main {
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();

        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(p2);

        th1.start();
        th2.start();


    }
}

class Process1 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Process 1 calling...");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Process2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Process 2 calling...");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
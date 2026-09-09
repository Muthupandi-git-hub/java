import java.util.Random;

class NumberData {
    int number;
    boolean ready = false;
    boolean processed = false;

    synchronized void setNumber(int n) throws InterruptedException {
        while (ready)
            wait();

        number = n;
        ready = true;
        processed = false;

        System.out.println("Thread 1: Generated Number = " + number);
        notifyAll();

        while (!processed)
            wait();
    }

    synchronized int getNumber() throws InterruptedException {
        while (!ready)
            wait();

        return number;
    }

    synchronized void done() {
        processed = true;
        ready = false;
        notifyAll();
    }
}

class Generator extends Thread {
    NumberData data;

    Generator(NumberData data) {
        this.data = data;
    }

    public void run() {
        Random r = new Random();

        try {
            for (int i = 1; i <= 5; i++) {
                int n = r.nextInt(10) + 1;	
                data.setNumber(n);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class SquareThread extends Thread {
    NumberData data;

    SquareThread(NumberData data) {
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                int n = data.getNumber();

                if (n % 2 == 0) {
                    System.out.println("Thread 2: Square of " + n + " = " + (n * n));
                    data.done();
                } else {
                    Thread.sleep(100);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class CubeThread extends Thread {
    NumberData data;

    CubeThread(NumberData data) {
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                int n = data.getNumber();

                if (n % 2 != 0) {
                    System.out.println("Thread 3: Cube of " + n + " = " + (n * n * n));
                    data.done();
                } else {
                    Thread.sleep(100);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberData data = new NumberData();

        Generator t1 = new Generator(data);
        SquareThread t2 = new SquareThread(data);
        CubeThread t3 = new CubeThread(data);

        t1.start();
        t2.start();
        t3.start();
    }
}

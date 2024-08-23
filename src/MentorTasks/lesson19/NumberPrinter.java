package MentorTasks.lesson19;

public class NumberPrinter implements Runnable {

    private final Lock lock;

    public NumberPrinter(Lock lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while(!lock.isNumberTurn()){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(i);
                lock.setNumberTurn(false);
                lock.notify();
            }
        }
    }
}
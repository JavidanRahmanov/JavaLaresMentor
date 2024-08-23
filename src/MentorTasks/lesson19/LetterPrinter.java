package MentorTasks.lesson19;

public class LetterPrinter implements Runnable {

    private final Lock lock;

    public LetterPrinter(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            for (char i = 'A'; i < 'E'; i++) {
                while (lock.isNumberTurn()){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(i);
                lock.setNumberTurn(true);
                lock.notify();
            }
        }
    }
}

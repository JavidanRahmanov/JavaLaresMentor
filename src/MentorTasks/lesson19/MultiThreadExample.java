package MentorTasks.lesson19;

public class MultiThreadExample {

    public static void main(String[] args) {

        Lock sharedLock = new Lock();

        NumberPrinter numberPrinter = new NumberPrinter(sharedLock);
        LetterPrinter letterPrinter = new LetterPrinter(sharedLock);

        Thread numberThread = new Thread(numberPrinter);
        Thread letterThread = new Thread(letterPrinter);

        numberThread.start();
        letterThread.start();

    }
}
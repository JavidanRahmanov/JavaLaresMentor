package MentorTasks.lesson10.task2;
import java.util.Random;

public class SlotMachine {
    Random random = new Random();
    String[] symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    String[] pullLever = new String[3];
    public String[] pullLever() {

        for(int i = 0; i < pullLever.length; i++){
            pullLever[i] = symbols[random.nextInt(symbols.length)];
        }
        return pullLever;
    }
    public void printRandomArray(){
        for(int i = 0; i < pullLever.length; i++){
            System.out.print(pullLever()[i]+ " ");
        }
        System.out.println();
    }
    public boolean winOrLose() {
        for(int i=0;i<pullLever.length;i++){
            for(int j=i+1;j<pullLever.length;j++) {
                if (!pullLever[i].equals(pullLever[j]))
                    return false;
            }
        }
        return true;
    }
    public void printResult(){
        if(winOrLose())
            System.out.println("You win!");
        else
            System.out.println("You lose!");
    }
}

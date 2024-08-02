package MentorTasks.lesson15.exercise;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        calculator.add(4,5);
        calculator.add(4.6,3.6);
        calculator.add(3,24,45);

        scientificCalculator.power(2,4);
    }
}

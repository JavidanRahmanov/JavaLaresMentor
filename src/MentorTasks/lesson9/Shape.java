package MentorTasks.lesson9;

import java.text.DecimalFormat;

public class Shape {
    String color;
    double width;
    double length;
    public Shape(String color, double width, double length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }
    double calculateArea(){
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(width*length));
    }
void printShape(){
        String shape;
        if(width == length)
            shape = "square";
        else
            shape = "rectangle";
    System.out.println(color  + " " + shape + " is " + calculateArea() + " sq.metres.");
}
}

package ru.croc.task5;
import java.util.Scanner;
public class Circle extends Figure{
    private int x;
    private int y;
    private int R;

    Circle(){}
    public String coordinateInformation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates: ");
        x = in.nextInt();
        y = in.nextInt();
        R = in.nextInt();
        while (R < 0){
            System.out.println("Radius less than zero");
            R = in.nextInt();
        }
        return " (<" + x +">, <" + y + ">), <"+ R + ">: ";
    }
    public String shapeName(){
        return "C";
    }
}
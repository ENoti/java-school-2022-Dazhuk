package ru.croc.task5;

public class Figure {
    private final int x;
    private final int y;
    Figure(){
        this.x = 0;
        this.y = 0;
    }
    protected String coordinateInformation(){
        return "F (<" + x +">, <" + y + ">): ";
    }
}

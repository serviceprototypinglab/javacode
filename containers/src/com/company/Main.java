package com.company;

public class Main {
    public static void main(String[] args) {
        Box box0 = new Box();
        Box box1 = new Box(1, 1, 1);
        Box box2 = new Box(2, 3, 4);
        BoxContainer boxContainer = new BoxContainer();
        boxContainer.addBox(box0);
        boxContainer.addBox(box1);
        boxContainer.addBox(box2);
        System.out.println("The total boxes volume is " + boxContainer.totalVolume());
    }
}

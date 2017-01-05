package com.company;

import java.util.ArrayList;

public class BoxContainer {
    private ArrayList<Box> boxes = new ArrayList<>();

    public int totalVolume() {
        int result = 0;
        for (Box box :
                boxes) {
            result += box.volume();
            System.out.println(result);
        }
        return result;
    }

    public void addBox(Box box) {
        boxes.add(box);
    }
}

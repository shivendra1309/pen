package org.example.models.pens;

import org.example.models.Color;

public class FountainPen implements Pen {
    @Override
    public void write() {
        System.out.println("FountainPen: write");
    }

    @Override
    public Color getColor() {
        return null;
    }
}

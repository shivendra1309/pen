package org.example.models.pens;

import org.example.models.Color;

public class DigitalPen implements Pen {
    @Override
    public void write() {
        System.out.println("DigitalPen: write");
    }

    @Override
    public Color getColor() {
        return null;
    }
}

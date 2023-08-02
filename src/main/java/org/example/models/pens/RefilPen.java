package org.example.models.pens;

import org.example.models.refils.Refil;
import org.example.models.Color;

public class RefilPen implements Pen {

    private Refil refil;

    RefilPen(Refil refil){
        this.refil = refil;
    }

    @Override
    public void write() {


    }

    @Override
    public Color getColor() {
        return null;
    }
}

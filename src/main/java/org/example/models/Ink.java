package org.example.models;

import org.example.models.Color;

public class Ink {
    private Color color;
    private boolean erasable;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isErasable() {
        return erasable;
    }

    public void setErasable(boolean erasable) {
        this.erasable = erasable;
    }
}

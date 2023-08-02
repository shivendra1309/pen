package org.example.models.refils;

import org.example.models.Nib;
import org.example.models.RefilType;

public abstract class Refil {
    private Nib nib;
    private RefilType type;

    Refil(RefilType type){
        this.type = type;
    }

    public RefilType getType() {
        return type;
    }

    public void setType(RefilType type) {
        this.type = type;
    }
}

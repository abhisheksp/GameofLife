package com.thoughtworks.base2;

public class Cell {

    private boolean isAlive;

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String format() {
        if(isAlive)
            return "X";
        return "-";
    }
}

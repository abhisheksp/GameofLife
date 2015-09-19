package com.thoughtworks.base2;

/* Cell is either dead and alive based on which it can format itself. */
public class Cell {

    private boolean isAlive;

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String format() {
        if (isAlive)
            return "X";
        return "-";
    }

    public boolean isAlive() {
        if (isAlive)
            return true;
        return false;
    }
}

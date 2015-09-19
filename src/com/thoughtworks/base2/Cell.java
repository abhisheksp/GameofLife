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
        return isAlive;
    }

    public void kill() {
        isAlive = false;
    }

    public void revive() {
        isAlive = true;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Cell thatCell = (Cell) that;
        return isAlive == thatCell.isAlive;
    }

    @Override
    public int hashCode() {
        return (isAlive ? 1 : 0);
    }
}

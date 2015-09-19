package com.thoughtworks.base2;

public class CellGrid {

    private Cell[][] cells;

    public CellGrid(Cell[][] cells) {
        this.cells = cells;
    }

    public int aliveNeighboursCount(int xCoordinate, int yCoordinate) {
        int count = 0;
        if (cells[xCoordinate][yCoordinate + 1].isAlive())
            count++;
        return count;
    }
}

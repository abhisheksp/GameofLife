package com.thoughtworks.base2;

public class CellGrid {

    private Cell[][] cells;

    public CellGrid(Cell[][] cells) {
        this.cells = cells;
    }

    public int aliveNeighboursCount(int xCoordinate, int yCoordinate) {
        int count = 0;
        count += verticalNeighboursCount(xCoordinate, yCoordinate);
        count += horizontalNeighboursCount(cells[xCoordinate], yCoordinate);
        return count;
    }

    private int verticalNeighboursCount(int xCoordinate, int yCoordinate) {
        int count = 0;
        if ((xCoordinate + 1 < cells.length) && cells[xCoordinate + 1][yCoordinate].isAlive())
            count++;
        if ((xCoordinate - 1 >= 0) && cells[xCoordinate - 1][yCoordinate].isAlive())
            count++;
        return count;
    }

    private int horizontalNeighboursCount(Cell[] cell, int yCoordinate) {
        int count = 0;
        if ((yCoordinate + 1 < cells[0].length) && cell[yCoordinate + 1].isAlive())
            count++;
        if ((yCoordinate - 1 >= 0) && cell[yCoordinate - 1].isAlive())
            count++;
        return count;
    }
}

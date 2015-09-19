package com.thoughtworks.base2;

/* CellGrid contains a grid of cells and can find alive neighbours coutn for each cell */
public class CellGrid {

    private Cell[][] cells;

    public CellGrid(Cell[][] cells) {
        this.cells = cells;
    }

    public int aliveNeighboursCount(int xCoordinate, int yCoordinate) {
        int count = 0;
        count += verticalAliveNeighboursCount(xCoordinate, yCoordinate);
        count += horizontalAliveNeighboursCount(cells[xCoordinate], yCoordinate);
        count += mainDiagonalAliveNeighboursCount(xCoordinate, yCoordinate);
        if (cells[xCoordinate - 1][yCoordinate + 1].isAlive())
            count++;
        return count;
    }

    private int mainDiagonalAliveNeighboursCount(int xCoordinate, int yCoordinate) {
        int count = 0;
        if ((xCoordinate - 1 >= 0 && yCoordinate - 1 >= 0) && cells[xCoordinate - 1][yCoordinate - 1].isAlive())
            count++;
        if ((xCoordinate + 1 < cells.length && yCoordinate + 1 < cells[0].length) && cells[xCoordinate + 1][yCoordinate + 1].isAlive())
            count++;
        return count;
    }

    private int verticalAliveNeighboursCount(int xCoordinate, int yCoordinate) {
        int count = 0;
        if ((xCoordinate + 1 < cells.length) && cells[xCoordinate + 1][yCoordinate].isAlive())
            count++;
        if ((xCoordinate - 1 >= 0) && cells[xCoordinate - 1][yCoordinate].isAlive())
            count++;
        return count;
    }

    private int horizontalAliveNeighboursCount(Cell[] cell, int yCoordinate) {
        int count = 0;
        if ((yCoordinate + 1 < cells[0].length) && cell[yCoordinate + 1].isAlive())
            count++;
        if ((yCoordinate - 1 >= 0) && cell[yCoordinate - 1].isAlive())
            count++;
        return count;
    }

    public Cell[][] evolve() {
        return cells;
    }
}

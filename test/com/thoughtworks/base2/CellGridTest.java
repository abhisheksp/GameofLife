package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellGridTest {

    @Test
    public void shouldReturnAliveNeighboursHorizontalCountInBothDirectionsWhenAliveNeighboursCountIsCalledForAGivenCell() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(0, 1));
    }

    @Test
    public void shouldCheckForArrayBoundsHorizontally() {
        Cell[][] cells = {
                {new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(0, cellGrid.aliveNeighboursCount(0, 0));
    }
}

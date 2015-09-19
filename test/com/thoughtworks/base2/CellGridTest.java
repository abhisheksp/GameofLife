package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellGridTest {

    @Test
    public void shouldReturnAliveNeighboursHorizontalCountInOneDirectionWhenAliveNeighboursCountIsCalledForAGivenCell() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(1, cellGrid.aliveNeighboursCount(0, 1));
    }
}

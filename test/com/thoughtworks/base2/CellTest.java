package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldReturnXIfCellIsAliveWhenFormatIsCalled() {
        Cell cell = new Cell(true);

        assertEquals("X", cell.format());
    }

    @Test
    public void shouldReturnHiphenIfCellIsDeadWhenFormatIsCalled() {
        Cell cell = new Cell(false);

        assertEquals("-", cell.format());
    }

    @Test
    public void shouldReturnTrueIfCellIsAliveWhenIsAliveIsCalled() {
        Cell cell = new Cell(true);

        assertTrue(cell.isAlive());
    }
}

package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void shouldReturnFalseIfCellIsDeadWhenIsAliveIsCalled() {
        Cell cell = new Cell(false);

        assertFalse(cell.isAlive());
    }

    @Test
    public void shouldKillAliveCellWhenKillIsCalled() {
        Cell cell = new Cell(true);

        cell.kill();

        assertEquals(new Cell(false).format(), cell.format());
    }

    @Test
    public void shouldRemainDeadWhenKillIsCalledOnDeadCell() {
        Cell cell = new Cell(false);

        cell.kill();

        assertEquals(new Cell(false).format(), cell.format());
    }

    @Test
    public void shouldReviveDeadCellWhenReviveIsCalled() {
        Cell cell = new Cell(false);

        cell.revive();

        assertEquals(new Cell(true).format(), cell.format());
    }

    @Test
    public void shouldRemainAliveWhenReviveIsCalledOnAliveCell() {
        Cell cell = new Cell(true);

        cell.revive();

        assertEquals(new Cell(true).format(), cell.format());
    }

    @Test
    public void cellShouldBeEqualToItself() {
        Cell cell = new Cell(true);
        assertEquals(cell, cell);
    }

    @Test
    public void twoAliveCellsAreEqual() {
        assertEquals(new Cell(true), new Cell(true));
    }
}

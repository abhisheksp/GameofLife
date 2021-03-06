package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void twoDeadCellsAreEqual() {
        assertEquals(new Cell(false), new Cell(false));
    }

    @Test
    public void cellShouldNotBeEqualToNull() {
        assertNotEquals(new Cell(true), null);
    }

    @Test
    public void cellShouldNotBeEqualToNonCellEntity() {
        assertNotEquals(new Cell(true), "Not a cell");
    }

    @Test
    public void aliveCellShouldHaveSameHashCode() {
        assertEquals(new Cell(true).hashCode(), new Cell(true).hashCode());
    }

    @Test
    public void deadCellShouldHaveSameHashCode() {
        assertEquals(new Cell(false).hashCode(), new Cell(false).hashCode());
    }
}

package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldReturnXIfCellIsAliveWhenFormatIsCalled(){
        Cell cell = new Cell(true);

        assertEquals("X", cell.format());
    }
}

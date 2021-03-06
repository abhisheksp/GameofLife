package com.thoughtworks.base2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CellGridTest {

    @Test
    public void shouldReturnAliveNeighboursHorizontalCountInBothDirectionsWhenAliveNeighboursCountIsCalledForAGivenCell() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldCheckForArrayBoundsHorizontally() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnAliveNeighboursVerticalCountInBothDirectionsWhenAliveNeighboursCountIsCalledForAGivenCell() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldCheckForArrayBoundsVertically() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnAliveNeighboursPrincipalDiagonalCountInBothDirectionsWhenAliveNeighboursCountIsCalledForAGivenCell() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldCheckForArrayBoundsInPrincipalDiagonal() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldReturnAliveNeighboursSecondaryDiagonalCountInBothDirectionsWhenAliveNeighboursCountIsCalledForAGivenCell() {
        Cell[][] cells = {
                {new Cell(false), new Cell(false), new Cell(true)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(true), new Cell(false), new Cell(false)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(2, cellGrid.aliveNeighboursCount(1, 1));
    }

    @Test
    public void shouldCheckForArrayBoundsInSecondaryDiagonal() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertEquals(1, cellGrid.aliveNeighboursCount(1, 2));
    }

    @Test
    public void shouldReturnSameGridWhenEvolveIsCalled() {
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(false), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertArrayEquals(cells, cellGrid.evolve());
    }

    @Test
    public void shouldReturnedCloneOfTheCurrentCellGridWhenCloneIsCalled() {
        Cell[][] cells = {
                {new Cell(true), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(false), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertArrayEquals(cells, cellGrid.cloneCurrentGeneration());
    }

    @Test
    public void shouldKillAliveCellsInTheGridIfAliveNeighboursCountIsLessThanTwo() {
        Cell[][] cells = {
                {new Cell(true), new Cell(false), new Cell(true)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(true), new Cell(false), new Cell(true)}
        };
        Cell[][] evolvedCells = {
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertArrayEquals(evolvedCells, cellGrid.evolve());
    }


    @Test
    public void shouldKillAliveCellsInTheGridIfAliveNeighboursCountIsMoreThanThree() {
        Cell[][] cells = {
                {new Cell(false), new Cell(true), new Cell(true)},
                {new Cell(true), new Cell(true), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)}
        };
        Cell[][] evolvedCells = {
                {new Cell(false), new Cell(false), new Cell(true)},
                {new Cell(true), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(false), new Cell(false)}
        };
        CellGrid cellGrid = new CellGrid(cells);


        assertArrayEquals(evolvedCells, cellGrid.evolve());
    }

    @Test
    public void cellsWhoseAliveNeighboursCountIsTwoOrThreeWillRemainTheSame() {
        Cell[][] cells = {
                {new Cell(false), new Cell(false), new Cell(true)},
                {new Cell(false), new Cell(true), new Cell(true)},
                {new Cell(false), new Cell(true), new Cell(false)}
        };
        Cell[][] evolvedCells = {
                {new Cell(false), new Cell(false), new Cell(true)},
                {new Cell(false), new Cell(true), new Cell(true)},
                {new Cell(false), new Cell(true), new Cell(false)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertArrayEquals(evolvedCells, cellGrid.evolve());
    }

    @Test
    public void deadCellsWithExactlyThreeNeighboursShouldComeBackToLife() {
        Cell[][] cells = {
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(true), new Cell(true)},
                {new Cell(false), new Cell(true), new Cell(false)}
        };
        Cell[][] evolvedCells = {
                {new Cell(false), new Cell(false), new Cell(false)},
                {new Cell(false), new Cell(true), new Cell(true)},
                {new Cell(false), new Cell(true), new Cell(true)}
        };
        CellGrid cellGrid = new CellGrid(cells);

        assertArrayEquals(evolvedCells, cellGrid.evolve());
    }
}

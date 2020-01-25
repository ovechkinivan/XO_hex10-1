package io.hexlet.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testGetName() {

        final String inputValue = "Vano";
        final String expectesValue = inputValue;

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectesValue, actualValue);
    }

    @Test
    void testGetFigure() {

        final Figure inputValue = Figure.X;
        final Figure expectesValue = inputValue;

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectesValue, actualValue);

    }
}
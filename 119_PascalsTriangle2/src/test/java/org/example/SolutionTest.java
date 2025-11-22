package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void testGenerate_1() {
        List<Integer> result = s.getRow(0);
        List<Integer> expected = new ArrayList<>(List.of(1));
        assertEquals(expected, result);
    }

    @Test
    void testGenerate_4() {
        List<Integer> result = s.getRow(3);
        List<Integer> expected = new ArrayList<>(List.of(1, 3, 3, 1));
        assertEquals(expected, result);
    }

    @Test
    void testGenerate_5() {
        List<Integer> result = s.getRow(4);
        List<Integer> expected = new ArrayList<>(List.of(1, 4, 6, 4, 1));
        assertEquals(expected, result);
    }
}
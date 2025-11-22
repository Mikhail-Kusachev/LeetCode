package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void testGenerate_1() {
        List<List<Integer>> result = s.generate(1);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));

        assertEquals(expected, result);
    }

    @Test
    void testGenerate_4() {
        List<List<Integer>> result = s.generate(4);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(1, 1));
        expected.add(List.of(1, 2, 1));
        expected.add(List.of(1, 3, 3, 1));

        assertEquals(expected, result);
    }

    @Test
    void testGenerate_5() {
        List<List<Integer>> result = s.generate(5);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(1, 1));
        expected.add(List.of(1, 2, 1));
        expected.add(List.of(1, 3, 3, 1));
        expected.add(List.of(1, 4, 6, 4, 1));

        assertEquals(expected, result);
    }
}
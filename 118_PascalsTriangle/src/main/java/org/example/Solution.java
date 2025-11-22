package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1)));
        List<Integer> head = result.get(0);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for(int j = 1; j < head.size(); j++)
                next.add(head.get(j - 1) + head.get(j));
            next.add(1);
            result.add(next);
            head = next;
        }

        return  result;
    }
}
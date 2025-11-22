package org.example;

import java.util.ArrayList;
import java.util.List;

//class Solution {
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i <= rowIndex; i++)
//            result.add(1);
//
//        for (int i = 1; i < rowIndex; i++)
//            for (int j = i; j > 0; j--)
//                result.set(j, result.get(j) + result.get(j - 1));
//
//        return result;
//    }
//}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return List.of(1);
        if (rowIndex == 1) return List.of(1,1);

        List<Integer> result = new ArrayList<>(List.of(1));

        for (int i = 2; i <= rowIndex; i++) {
            int j = result.size() - 1;
            if (i % 2 == 0)
                result.add(result.get(result.size() - 1) * 2);
            for( ; j > 0; j--)
                result.set(j, result.get(j) + result.get(j - 1));
        }

        if (rowIndex % 2 != 0)
            result.add(result.get(result.size() - 1));
        for(int i = rowIndex / 2; i > 0; i--)
            result.add(result.get(i - 1));

        return result;
    }
}
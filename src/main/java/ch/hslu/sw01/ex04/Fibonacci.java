package ch.hslu.sw01.ex04;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> fiboMap = new HashMap<>();
    public int fiboRec1(final int n) {
        if (n < 2) {
            return n;
        }
        return fiboRec1(n-2) + fiboRec1(n-1);
    }

    public int fiboRec2(final int n) {
        if (!fiboMap.isEmpty() && fiboMap.containsKey(n)) {
            return fiboMap.get(n);
        } else if (n < 2) {
            fiboMap.put(n, n);
            return n;
        }
        int result =  fiboRec2(n-2) + fiboRec2(n-1);
        fiboMap.put(n, result);
        return result;
    }

    public int fiboIter(final int n) {
        int fiboSeq[];
        for (int i = 0; i < n; i++) {
            fiboSeq
        }
        return result;
    }
}

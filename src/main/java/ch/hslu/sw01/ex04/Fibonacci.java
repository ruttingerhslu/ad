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
        Map<Integer, Integer> sequence = new HashMap<>();
        sequence.put(0, 0);
        sequence.put(1, 1);
        for (int i = 2; i <= n; i++) {
            sequence.put(i, sequence.get(i-2) + sequence.get(i-1));
        }
        return sequence.get(n);
    }
}

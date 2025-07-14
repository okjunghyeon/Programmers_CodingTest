package lv1.크기가_작은_부분문자열;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
//    public int solution(String t, String p) {
//        int count = 0;
//
//        for (int i = 0; i < t.length() - p.length() + 1; i++) {
//            String sub = t.substring(i, i+ p.length());
//            if(sub.compareTo(p) <= 0) count++;
//        }
//
//        return count;
//    }

    public int solution(String t, String p) {
        long pValue = Long.parseLong(p);
        int count = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long tValue = Long.parseLong(t.substring(i, i + p.length()));
            if (tValue <= pValue) count += 1;
        }
        return count;
    }
}
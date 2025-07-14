package lv1.예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {

        Arrays.sort(d);

        for(int sum = 0, count = 0; count < d.length; count++) {
            sum += d[count];
            if(sum > budget) return count;
        }

        return d.length;
    }
}
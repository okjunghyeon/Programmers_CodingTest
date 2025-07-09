package lv1.음양_더하기;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int sum = 0;
//
//        for(int i=0; i<absolutes.length; i++) {
//            if(signs[i]) sum += absolutes[i];
//            else sum -= absolutes[i];
//        }
//
//        return sum;
//    }
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.rangeClosed(0, absolutes.length)
                .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
                .sum();
    }
}
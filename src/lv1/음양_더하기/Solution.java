package lv1.음양_더하기;


import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        return IntStream.rangeClosed(0, absolutes.length).map(i -> signs[i] ? absolutes[i] : -absolutes[i]).sum();
    }
}
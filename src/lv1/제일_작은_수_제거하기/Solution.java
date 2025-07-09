package lv1.제일_작은_수_제거하기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        int[] array = Arrays.stream(arr)
                .filter(e -> e != min)
                .toArray();

        return array.length != 0 ? array : new int[]{-1};
    }
}
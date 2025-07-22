package lv1.최소직사각형;

class Solution {
    public int solution(int[][] sizes) {
        // sizes 를 순회하며 가로 세로 중 큰값과 작은값으로 구분한다.
        // 큰값은 max와 작은값은 min과 비교하여 더 클 경우 교체한다.
        int max, min;
        max = min = 0;

        for(int[] size : sizes) {
            int a = Math.max(size[0], size[1]);
            int b = Math.min(size[0], size[1]);

            if(a > max)
                max = a;
            if(b > min)
                min = b;
        }

        return max * min;
    }
}
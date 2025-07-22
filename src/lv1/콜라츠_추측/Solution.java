package lv1.콜라츠_추측;

class Solution {
    public int solution(int num) {
        long n = num;
        for(int count = 0; count < 500; count++) {
            if(n == 1)
                return count;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}
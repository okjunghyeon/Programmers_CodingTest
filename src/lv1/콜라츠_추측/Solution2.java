package lv1.콜라츠_추측;

class Solution2 {
    public int solution(int num) {
        int count = 0;
        long numLong = num;

        while(numLong != 1) {
            if(count >= 500)
                return -1;

            if(numLong % 2 == 0) {
                numLong /= 2;
            } else {
                numLong = numLong * 3 + 1;
            }
            count++;
        }

        return count;
    }
}
package lv1.콜라츠_추측;

class Solution {
    //    public int solution(int num) {
//        int count = 0;
//        long numLong = num;
//
//        while (numLong != 1) {
//            if (count >= 500) return -1;
//
//            if (numLong % 2 == 0) {
//                numLong /= 2;
//            } else {
//                numLong = numLong * 3 + 1;
//            }
//            count++;
//        }
//
//        return count;
//    }
    public int solution(int num) {
        long n = num;
        for (int count = 0; count < 500; count++) {
            if (n == 1) return count;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}
package lv1.부족한_금액_계산하기;

import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long total = LongStream.rangeClosed(1, count)
                .map(e -> e * price)
                .sum() - money;

        return total > 0 ? total : 0;
    }
}
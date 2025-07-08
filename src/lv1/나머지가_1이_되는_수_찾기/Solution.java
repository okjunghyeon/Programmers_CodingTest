package lv1.나머지가_1이_되는_수_찾기;

import java.util.stream.IntStream;

public class Solution {

//    public int solution(int n) {
//        int x = 2;
//
//        while(true){
//            if(n%x==1) break;
//            x++;
//        }
//
//        return x;
//    }

    public int solution(int n) {
        return IntStream.range(2, n)
                .filter(num -> n % num == 1)
                .findFirst()
                .orElse(-1);
    }
}
package lv1.햄버거_만들기;

// 1231 순서가 나와야함

// 한문자로 만든다
// 1231을 replace한다
// 기존 문자와 길이차이 / 4 를 해서 answer 에 저장한다
// 기존과 길이차이가 나지 않을때까지 반복한다

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] ingredient) {
        String recipe = "1231";
        String burgers = Arrays.stream(ingredient).mapToObj(String::valueOf).collect(Collectors.joining());
        String packing = "";
        int answer = 0;

        while(true) {
            packing = burgers.replace(recipe, "");
            if(burgers.length() != packing.length()) {
                answer += (burgers.length() - packing.length()) / 4;
                burgers = packing;
            } else {
                break;
            }
        }
        return answer;
    }
}
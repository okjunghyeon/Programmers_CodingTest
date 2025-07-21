package lv1.로또의_최고_순위와_최저_순위;

//  lottos	                win_nums	                result
//  [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	    [3, 5]
//  [0, 0, 0, 0, 0, 0]	    [38, 19, 20, 40, 15, 25]	[1, 6]
//  [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	    [1, 1]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        // 1. 0의 개수를 센다
        int zeroCount = (int) Arrays.stream(lottos)
                .filter(e -> e == 0)
                .count();

        // 2. contains 메서드 사용을 위해 당첨 번호를 리스트로 변환
        List<Integer> winList = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toList());

        // 3. 당첨 번호와 일치하는 로또 번호 개수를 센다
        int sameCount = (int) Arrays.stream(lottos)
                .filter(winList::contains)
                .count();

        // 4. [최고 순위, 최저 순위]를 반환
        // 최고 순위: 일치하는 번호 + 0의 개수
        // 최저 순위: 일치하는 번호만
        int[] lottery = new int[]{6, 6, 5, 4, 3, 2, 1};
        return new int[]{lottery[sameCount + zeroCount], lottery[sameCount]};
    }
}

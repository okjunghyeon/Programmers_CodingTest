package lv1.햄버거_만들기;

import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public int solution(int[] ingredient) {
        List<Integer> burgers = new ArrayList<>();
        int answer = 0;

        for(int n : ingredient) {
            burgers.add(n);

            int size = burgers.size();

            if(size >= 4) {
                if(burgers.get(size - 4) == 1
                   && burgers.get(size - 3) == 2
                   && burgers.get(size - 2) == 3
                   && burgers.get(size - 1) == 1) {

                    answer++;

                    for(int i = 1; i <= 4; i++) {
                        burgers.remove(size - i);
                    }
                }
            }
        }
        return answer;
    }
}
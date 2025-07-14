package lv1.같은_숫자는_싫어;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        List<Integer> list = stack.stream().collect(Collectors.toList());
        Collections.reverse(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
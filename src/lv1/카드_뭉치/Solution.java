package lv1.카드_뭉치;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> q1 = new ArrayDeque<>(List.of(cards1));
        Queue<String> q2 = new ArrayDeque<>(List.of(cards2));

        for(String word : goal) {
            if(!q1.isEmpty() && q1.peek().equals(word)) {
                q1.poll();
            } else if(!q2.isEmpty() && q2.peek().equals(word)) {
                q2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
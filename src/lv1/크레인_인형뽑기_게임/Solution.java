package lv1.크레인_인형뽑기_게임;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // 각 열을 스택으로 관리하기 위한 Deque 배열
        Deque<Integer>[] stacks = new ArrayDeque[board.length];

        for(int i = 0; i < stacks.length; i++) {
            stacks[i] = new ArrayDeque<>();
        }

        // 2차원 배열 board를 각 열에 해당하는 스택으로 변환
        for(int i = board.length - 1; i >= 0; i--) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != 0) { // 인형이 있는 칸만
                    stacks[j].push(board[i][j]); // 해당 열의 스택에 추가
                }
            }
        }

        // 뽑은 인형을 담을 바구니와 사라진 인형 수
        Deque<Integer> basket = new ArrayDeque<>();
        int answer = 0;

        for(int move : moves) {
            move--; // 시작 인덱스인 0과 맞추기 위해 -1 해주기

            // 해당 열에 인형이 남아있다면
            if(!stacks[move].isEmpty()) {
                int n = stacks[move].pop(); // 인형을 하나 뽑음

                // 바구니의 맨 위 인형과 새로 뽑은 인형이 같으면
                if(!basket.isEmpty() && basket.peek() == n) {
                    basket.pop(); // 바구니 인형을 터트리고
                    answer += 2;  // 사라진 인형 2개 추가
                } else {
                    basket.push(n); // 다르면 바구니에 새로 쌓음
                }
            }
        }

        return answer;
    }
}
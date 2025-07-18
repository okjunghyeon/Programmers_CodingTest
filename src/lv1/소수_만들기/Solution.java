package lv1.소수_만들기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int a = 0; a < nums.length - 2; a++) {
            for (int b = a + 1; b < nums.length - 1; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    list.add(nums[a] + nums[b] + nums[c]);
                }
            }
        }

        // 소수인지 판단하여 count 에 추가
        return (int) list.stream()
                .filter(this::isPrimeNumber)
                .count();
    }

    boolean isPrimeNumber(int n) {
        int sqrt = (int) Math.sqrt(n); // 제곱근 구하기

        for (int i = 2; i <= sqrt; i++) { // 약수는 항상 쌍을 이루기때문에 제곱근 까지만 탐색
            if (n % i == 0) return false;
        }
        return true;
    }
}
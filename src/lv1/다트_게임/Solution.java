package lv1.다트_게임;

import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {

        // 점수(숫자)만 뽑아 int[]로 변환
        int[] numbers = Arrays.stream(dartResult.split("[^0-9]")) // 숫자가 아닌 문자로 split
                .filter(e -> !e.isBlank())           // 빈 토큰 제거
                .mapToInt(Integer::parseInt)         // int 변환
                .toArray();

        // 점수를 제외한 옵션(S·D·T·*·#)만 String[]로 추출
        String[] options = Arrays.stream(dartResult.split("[0-9]")) // 숫자로 split
                .filter(e -> !e.isBlank())         // 빈 토큰 제거
                .toArray(String[]::new);


        for (int i = 0; i < numbers.length; i++) {

            // 옵션 문자열을 문자 단위로 순회
            for (char option : options[i].toCharArray()) {
                switch (option) {
                    case 'D':               // Double → 제곱 2
                        numbers[i] = (int) Math.pow(numbers[i], 2);
                        break;
                    case 'T':               // Triple → 제곱 3
                        numbers[i] = (int) Math.pow(numbers[i], 3);
                        break;
                    case '*':               // 스타상 → 현재·이전 점수 2배
                        numbers[i] *= 2;
                        if (i > 0) numbers[i - 1] *= 2;
                        break;
                    case '#':               // 아차상 → 현재 점수 음수
                        numbers[i] *= -1;
                        break;
                    // 'S'는 1제곱이라 별도 처리 불필요
                }
            }
        }
        // 세 라운드 점수 합계 반환
        return Arrays.stream(numbers).sum();
    }
}
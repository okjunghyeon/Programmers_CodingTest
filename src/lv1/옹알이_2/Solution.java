package lv1.옹알이_2;
// 고민1
//import java.util.Arrays;
//
//class Solution {
//    public int solution(String[] babbling) {
//        // 발음할 수 있는 단어 목록
//        String[] canBabbles = {"aya", "ye", "woo", "ma"};
//
//        for (int i = 0; i < babbling.length; i++) {
//
//            while (true) {
//                String match = "";
//
//                // 발음 가능한 단어로 시작하는지 확인
//                for (String canBabble : canBabbles) {
//                    if (babbling[i].startsWith(canBabble)) {
//                        match = canBabble; // 일치하는 단어를 찾으면 저장 후 종료
//                        break;
//                    }
//                }
//
//                // 1. 더 이상 일치하는 발음이 없으면 다음 단어로 이동
//                if (match.isEmpty()) {
//                    break;
//                }
//
//                // 2. 연속으로 같은 발음을 하는 경우(예: "yeye")는 불가능하므로 중단
//                if (babbling[i].substring(match.length()).startsWith(match)) {
//                    break;
//                }
//
//                // 일치하는 발음을 단어에서 제거 (문자열을 잘라냄)
//                babbling[i] = babbling[i].substring(match.length());
//            }
//        }
//
//        // 빈 문자열이 된 단어(완전히 발음 가능한 단어)의 개수를 반환
//        return (int) Arrays.stream(babbling)
//                .filter(String::isEmpty)
//                .count();
//    }
//}

// 고민2
//import java.util.Arrays;
//
//class Solution {
//    public int solution(String[] babbling) {
//        String[] speak = {"aya", "ye", "woo", "ma"};
//        String[] speakTwoTime = {"ayaaya", "yeye", "woowoo", "mama"};
//
//        A: for (int i = 0; i < babbling.length; i++) {
//
//            // 두번 연속으로 발음하는 경우 체크
//            for (String s : speakTwoTime) {
//                if (babbling[i].contains(s)) {
//                    continue A;
//                }
//            }
//
//            while (true) {
//                String match = Arrays.stream(speak)
//                        .filter(babbling[i]::startsWith)
//                        .findFirst()
//                        .orElse("");
//
//                if (match.isEmpty()) {
//                    break;
//                }
//
//                babbling[i] = babbling[i].substring(match.length());
//            }
//        }
//        return (int) Arrays.stream(babbling)
//                .filter(String::isEmpty).count();
//    }
//}


import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        String[] speakTwoTime = {"ayaaya", "yeye", "woowoo", "mama"};

        A: for (int i = 0; i < babbling.length; i++) {

            // 두번 연속으로 발음하는 경우 체크
            for (String s : speakTwoTime) {
                if (babbling[i].contains(s)) {
                    continue A;
                }
            }

            for (String s : speak) {
                // 공백으로 변환하여 단어 삭제로 인해 새로운 문자가 생성되지 않도록 주의
                babbling[i] = babbling[i].replace(s, " ");
            }
        }
        return (int) Arrays.stream(babbling)
                .filter(String::isBlank).count();
    }
}
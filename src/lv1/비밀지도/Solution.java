package lv1.비밀지도;

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 두 배열을 각각 2진수 문자열로 변환
        String[] secret1 = toSecret(arr1, n);
        String[] secret2 = toSecret(arr2, n);

        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();

        // 각 행마다 처리
        for(int i = 0; i < n; i++) {
            // 각 열마다 OR 연산 수행
            for(int j = 0; j < n; j++) {
                // 둘 중 하나라도 1이면 벽('#'), 둘 다 0이면 공백(' ')
                if(secret1[i].charAt(j) == '1' || secret2[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb.setLength(0);  // StringBuilder 초기화
        }
        return answer;
    }

    String[] toSecret(int[] arr, int n) {
        String s = "%" + n + "s";
        return Arrays.stream(arr).mapToObj(str -> String.format(s, Integer.toString(str, 2)))  // 10진수 → 2진수 문자열
                .map(str -> str.replaceAll(" ", "0")).toArray(String[]::new);
    }
}
//class Solution {
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//        String s = "%0" + n + "s";
//
//        for(int i=0; i<n; i++){
//            answer[i] = String.format(s, Integer.toString(arr1[i] | arr2[i], 2))
//                    .replace("0", " ").replaceAll("1", "#");
//        }
//
//        return answer;
//    }
//}
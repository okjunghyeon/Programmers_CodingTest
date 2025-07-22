package lv1.문자열_나누기;

class Solution {
    public int solution(String s) {
        int answer = 0;

        // A 라벨: continue A를 통해 이 while 루프의 처음으로 바로 돌아가기 위함
        A:
        while(!s.isEmpty()) {

            for(int i = 0; i < s.length(); i++) {
                String temp = s.substring(0, i + 1); // 현재 검사할 부분 문자열
                char x = temp.charAt(0);     // 기준이 되는 첫 글자

                // temp에서 첫 글자(x)의 개수와 다른 글자(y)의 개수를 센다
                int yCount = temp.replace(String.valueOf(x), "").length();
                int xCount = temp.length() - yCount;

                // x의 개수와 y의 개수가 같아지는 순간, 문자열을 분리한다
                if(xCount == yCount) {
                    s = s.substring(i + 1);
                    answer++;
                    continue A; // 처음부터 다시 시작
                }
            }
            // for문이 끝까지 돌았는데 분리 지점을 못 찾은 경우
            break; // 더 이상 분해할 수 없으므로 루프 탈출
        }

        // 루프 종료 후 남은 문자열이 있다면 1을 더해준다.
        return s.isEmpty() ? answer : answer + 1;
    }
}
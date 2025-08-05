package lv1.신규_아이디_추천;

class Solution {
    public String solution(String new_id) {

        String id = new_id;

        // 1. 모두 소문자로 변환
        id = id.toLowerCase();

        // 2. 소문자 숫자 - _ . 제외 모두 제거
        id = id.replaceAll("[^a-z0-9-_.]", "");

        // 3. .. 을 모두 . 으로 변경
        while(id.contains("..")) {
            id = id.replace("..", ".");
        }

        // 4. .으로 시작 혹은 종료한다면 제거
        id = deleteStartOrEndPeriod(id);

        // 5. 빈문자열이면 "a" 대입
        if(id.isEmpty()) {
            id = "a";
        }

        // 6. 16자가 넘어가면 15까지만 냅두고 제거, .이 끝에 위치하면 제거
        if(id.length() > 15) {
            id = deleteStartOrEndPeriod(id.substring(0, 15));
        }

        // 7. 2자보다 작다면 마지막문자를 길이3이 될때까지 반복
        if(id.length() < 3) {
            int length = id.length();
            int index = 3 - length;
            char c = id.charAt(length - 1);
            id = id + String.valueOf(c)
                    .repeat(index);
        }

        return id;
    }

    private String deleteStartOrEndPeriod(String str) {
        int start = 0;
        if(str.startsWith(".")) {
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '.') {
                    start++;
                } else {
                    break;
                }
            }
        }
        str = str.substring(start);

        int end = str.length();
        if(str.endsWith(".")) {
            for(int i = str.length() - 1; i >= 0; i--) {
                if(str.charAt(i) == '.') {
                    end--;
                } else {
                    break;
                }
            }
        }

        return str.substring(0, end);
    }
}
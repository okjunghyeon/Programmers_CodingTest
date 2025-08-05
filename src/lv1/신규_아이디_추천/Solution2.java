package lv1.신규_아이디_추천;

class Solution2 {
    public String solution(String new_id) {

        // 1. 모두 소문자로 변환
        String id = new_id.toLowerCase();

        // 2. 소문자 숫자 - _ . 제외 모두 제거
        id = id.replaceAll("[^a-z0-9-_.]", "");

        // 3. .. 을 모두 . 으로 변경
        id = id.replaceAll("[.]{2,}", ".");

        // 4. .으로 시작 혹은 종료한다면 제거
        id = id.replaceAll("^[.]|[.]$", "");

        // 5. 빈문자열이면 "a" 대입
        if(id.isEmpty()) {
            id = "a";
        }

        // 6. 16자가 넘어가면 15까지만 냅두고 제거, .이 끝에 위치하면 제거
        if(id.length() >= 16) {
            id = id.substring(0, 15);
            id = id.replaceAll("[.]$", "");
        }

        // 7. 2자보다 작다면 마지막문자를 길이3이 될때까지 반복
        while(id.length() < 3) {
            id += id.charAt(id.length() - 1);
        }

        return id;
    }
}
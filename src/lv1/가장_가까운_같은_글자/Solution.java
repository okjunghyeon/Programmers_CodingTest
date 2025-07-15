package lv1.가장_가까운_같은_글자;

//         1. 찾고자하는 문자 target을 구한다
//         2. i 번째 문자 바로 앞까지 s 문자열을 자른다
//         3. 자른 문자열에서 target과 동일하고 가장 마지막에 존재하는 문자의 index를 구한다
//         4. 동일한 문자가 존재하지않는다면(-1) -1을 저장하고 존재한다면 index 값의 차이를 저장한다.
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);

            int index = s.substring(0, i)
                    .lastIndexOf(target);

            answer[i] = index != -1 ? i - index : -1;
        }
        return answer;
    }
}
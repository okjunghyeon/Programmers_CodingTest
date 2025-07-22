package lv1.둘만의_암호;

/**
 * s를 각 문자를 기준으로 순회한다
 *
 * s.charAt을 index만큼 이동해 나간다
 * 만약 이동할 문자가 z 일경우 a로 간다
 * 만약 이동할 문자가 skip에 포함된다면 횟수를 세지않고 넘어간다
 * 이동 완료된 문자는 저장한다
 *
 * 순회 후 저장된 모든 문자를 문자열로 바꿔 return 한다
 */
class Solution {

    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            int count = 0;

            while(count < index) {
                c = (char) ('a' + (c - 'a' + 1) % 26);
                if(!skip.contains(String.valueOf(c)))
                    count++;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
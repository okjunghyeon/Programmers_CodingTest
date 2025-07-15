package lv1.시저_암호;

class Solution {
    public String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isAlphabetic(c)) {
                if (Character.isLowerCase(c)) {
                    sb.append((c + n) % 'a');
                } else {
                    sb.append((c + n) % 'A');
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
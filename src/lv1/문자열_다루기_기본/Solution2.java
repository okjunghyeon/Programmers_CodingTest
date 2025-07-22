package lv1.문자열_다루기_기본;

class Solution2 {
    public boolean solution(String s) {

        for(char c : s.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }

        return s.length() == 4 || s.length() == 6;
    }
}

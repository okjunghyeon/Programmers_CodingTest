package lv1.문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {

        try {
            int n = Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }

        return s.length() == 4 || s.length() == 6;
    }
}

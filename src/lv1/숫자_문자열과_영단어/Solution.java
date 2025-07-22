package lv1.숫자_문자열과_영단어;

class Solution {
    public int solution(String s) {

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < numbers.length; i++) {
            s = s.replaceAll(numbers[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
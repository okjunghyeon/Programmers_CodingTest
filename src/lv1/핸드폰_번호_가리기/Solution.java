package lv1.핸드폰_번호_가리기;

class Solution {

    public String solution(String phone_number) {
        int index = phone_number.length() - 4;
        return "*".repeat(index) + phone_number.substring(index);
    }
}
package lv1.핸드폰_번호_가리기;

class Solution2 {
        public String solution(String phone_number) {
            int point = phone_number.length() - 4;
            StringBuilder sb = new StringBuilder("*".repeat(point));


            return sb.append(phone_number.substring(point)).toString();
        }
}
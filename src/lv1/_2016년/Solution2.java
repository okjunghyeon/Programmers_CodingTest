package lv1._2016년;

class Solution2 {
    public String solution(int a, int b) {
        // 2016년 1월 1일은 금요일입니다.
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int count = 0;
        // a-1 달 까지 총 일수를 구한다
        for (int i = 0; i < a - 1; i++) {
            count += days[i];
        }

        // 구한 수에 +b를 한다.
        count += b;

        // 값을 7로 나눈 나머지를 구한다.
        count %= 7;

        // 요일의 index에 해당하는 날짜를 반환한다
        return months[count];
    }
}
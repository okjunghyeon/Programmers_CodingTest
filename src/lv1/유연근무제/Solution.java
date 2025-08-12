package lv1.유연근무제;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        String[] weekend = {"월", "화", "수", "목", "금", "토", "일"};

        // 750 + 10 -> 760 -> 800
        for(int index = 0; index < schedules.length; index++) {
            int hour = schedules[index] / 100;
            int min = (schedules[index] % 100 + 10);

            if(min >= 60) {
                hour += min / 60;
                min %= 60;
            }
            schedules[index] = 100 * hour + min;
        }

        A: for(int i = 0; i < schedules.length; i++) {

            int timeout = schedules[i];
            for(int day = 0; day < timelogs[i].length; day++) {
                String today = weekend[(startday + day - 1) % 7];

                // 한번이라도 지각한 경우 다음 사람으로 넘어감
                if(!today.equals("토") && !today.equals("일")) {
                    if(timeout < timelogs[i][day]) {
                        continue A;
                    }
                }
            }
            answer++;
        }

        return answer;
    }
}
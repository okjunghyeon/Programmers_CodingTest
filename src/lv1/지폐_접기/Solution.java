package lv1.지폐_접기;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        // 지갑의 긴 변과 짧은 변
        int width = Math.max(wallet[0], wallet[1]);
        int height = Math.min(wallet[0], wallet[1]);

        int answer = 0; // 접는 횟수

        while(true) {
            // 현재 크기로 지갑에 들어가면 종료
            if(width >= Math.max(bill[0], bill[1]) && height >= Math.min(bill[0], bill[1])) {
                break;
            }

            // 더 긴 변을 반으로 접는다
            if(bill[0] >= bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++; // 접었으니 횟수 +1
        }
        return answer;
    }
}
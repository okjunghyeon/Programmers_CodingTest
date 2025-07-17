package lv1.기사단원의_무기;

// * number	limit	power	result
// * 5	    3	    2	    10
// * 10	    3	    2	    21
// */
//class Solution {
//    public int solution(int number, int limit, int power) {
//        // 1~number 기사단원으로 분기한다
//        // 기사번호의 약수의 개수를 구한다.
//        // 약수의 개수가 limit를 초과할경우 power를, 초과하지않으면 약수의 개수를 result에 더한다
//
//        int answer = 0;
//
//        for (int i = 1; i <= number; i++) {
//            int count = 0;
//
//            for (int j = 1; j <= i / 2; j++) {
//                if (i % j == 0) count++;
//            }
//
//            count++;
//
//            answer += (count > limit) ? power : count;
//        }
//
//        return answer;
//    }
//}
class Solution {
    public int solution(int number, int limit, int power) {
        int total = 0;

        for (int i = 1; i <= number; i++) {
            int count = getDivisorCount(i);
            total += (count > limit) ? power : count;
        }

        return total;
    }

    int getDivisorCount(int number){
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if(number % i == 0){
                count++;
                if(i*i != number) {
                    count++;
                }
            }
        }
        return count;
    }
}
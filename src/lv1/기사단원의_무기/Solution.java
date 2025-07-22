package lv1.기사단원의_무기;

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
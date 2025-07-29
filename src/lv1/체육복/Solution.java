package lv1.체육복;

/*
n	lost	reserve	    return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	        4
3	[3]	    [1]	        2
* */

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];
        Arrays.fill(students, 1);
        students[0] = -1;

        for(int number : reserve) {
            students[number]++;
        }

        for(int number : lost) {
            students[number]--;
        }

        Arrays.sort(lost);

        for(int number : lost) {
            if(students[number] == 0) {
                if(number > 0 && students[number - 1] > 1) {
                    students[number - 1]--;
                    students[number]++;
                } else if(number < n && students[number + 1] > 1) {
                    students[number + 1]--;
                    students[number]++;
                }
            }
        }
        return (int) Arrays.stream(students).filter(e -> e > 0).count();
    }
}

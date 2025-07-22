package lv1.나머지가_1이_되는_수_찾기;

public class Solution2 {
    public int solution(int n) {
        int x = 2;

        while(true) {
            if(n % x == 1)
                break;
            x++;
        }

        return x;
    }
}
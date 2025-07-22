package lv1.크기가_작은_부분문자열;

class Solution2 {
    public int solution(String t, String p) {
        int count = 0;

        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            String sub = t.substring(i, i + p.length());
            if(sub.compareTo(p) <= 0)
                count++;
        }

        return count;
    }
}
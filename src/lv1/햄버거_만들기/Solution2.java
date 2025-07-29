package lv1.햄버거_만들기;

class Solution2 {
    public int solution(int[] ingredient) {
        String recipe = "1231";
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        for(int n : ingredient) {
            sb.append(n);
        }

        while(true) {
            int index = sb.indexOf(recipe);
            if(index == -1) {
                break;
            }
            sb.delete(index, index + 4);
            answer++;
        }
        return answer;
    }
}
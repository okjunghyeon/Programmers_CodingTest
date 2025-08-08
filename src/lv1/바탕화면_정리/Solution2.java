package lv1.바탕화면_정리;

class Solution2 {
    public int[] solution(String[] wallpaper) {
        int up = Integer.MAX_VALUE, down = Integer.MIN_VALUE, left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;

        for(int y = 0; y < wallpaper.length; y++) {
            for(int x = 0; x < wallpaper[0].length(); x++) {
                if(wallpaper[y].charAt(x) == '#') {
                    up = Math.min(up, y);
                    down = Math.max(down, y + 1);
                    left = Math.min(left, x);
                    right = Math.max(right, x + 1);
                }
            }
        }

        return new int[]{up, left, down, right};
    }
}
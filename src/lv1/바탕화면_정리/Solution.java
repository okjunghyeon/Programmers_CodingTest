package lv1.바탕화면_정리;

class Solution {
    public int[] solution(String[] wallpaper) {
        int up = 0, down = 0;

        // 위에서 부터 #이 있으면 멈추기
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                up = i;
                break;
            }
        }

        // 밑에서 부터 #이 있으면 멈추고 1 더하기
        for(int i = wallpaper.length - 1; i >= 0; i--) {
            if(wallpaper[i].contains("#")) {
                down = i + 1; // 좌표를 맞추기 위해 +1
                break;
            }
        }

        // 전체분기하여 가장 왼쪽과 오른쪽에 나타나는 # 위치 찾기
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for(int i = 0; i < wallpaper.length; i++) {
            int p1 = wallpaper[i].indexOf("#");
            int p2 = wallpaper[i].lastIndexOf("#");

            left = (p1 == -1) ? left : Math.min(left, p1);
            right = (p2 == -1) ? right : Math.max(right, ++p2); // p2는 좌표를 맞추기 위해 +1
        }

        return new int[]{up, left, down, right};
    }
}
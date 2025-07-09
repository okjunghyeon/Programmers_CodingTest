package lv1.서울에서_김서방_찾기;

import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return String.format("김서방은 %d에 있다", index);
    }
}
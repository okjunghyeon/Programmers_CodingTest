package lv1.평균_구하기;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public double solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        return list.stream().mapToDouble(Double::valueOf).average().orElse(-1);
    }

//    import java.util.*;
//    class Solution {
//        public double solution(int[] arr) {
//            return Arrays.stream(arr).average().orElse(-1);
//        }
//    }

//    import java.util.*;
//    class Solution {
//        public double solution(int[] arr) {
//            return Arrays.stream(arr).average().getAsDouble();
//        }
//    }
}
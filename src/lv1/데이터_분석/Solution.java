package lv1.데이터_분석;

import java.util.*;

class Solution {
    class Product {
        Map<String, Integer> map;

        Product(int code, int date, int maximum, int remain) {
            map = new HashMap<>();
            map.put("code", code);
            map.put("date", date);
            map.put("maximum", maximum);
            map.put("remain", remain);
        }

        int getData(String name) {
            return map.get(name);
        }

        int[] getArray() {
            return new int[]{map.get("code"), map.get("date"), map.get("maximum"), map.get("remain")};
        }
    }
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Product> products = new ArrayList<>();

        for(int[] d : data) {
            products.add(new Product(d[0], d[1], d[2], d[3]));
        }

        return products.stream()
                .filter(e -> e.getData(ext) < val_ext)
                .sorted(Comparator.comparing(o -> o.getData(sort_by)))
                .map(Product::getArray)
                .toArray(int[][]::new);
    }
}
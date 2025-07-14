package lv1.직사각형_별찍기;

import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        for(int i = 0; i < b; i++) {
            bw.write("*".repeat(a));
            bw.newLine();
        }

        bw.close(); // close에는 flush가 포함되어 있습니다.
        br.close();
    }
}
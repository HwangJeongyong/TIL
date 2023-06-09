// 2023/05/02
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
                map.put(name[i], yearning[i]);
        }

        System.out.println(map);
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += map.getOrDefault((photo[i][j]), 0);
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}

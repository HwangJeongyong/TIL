// 2023/05/25
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
package Programmers;

import java.util.HashMap;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int num = map.getOrDefault(c, -1);
            map.put(c, i);
            if (num == -1) {
                answer[i] = num;
            } else {
                answer[i] = i - num;
            }
        }

    }
    
}

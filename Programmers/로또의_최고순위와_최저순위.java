// 2023/05/21
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
package Programmers;

import java.util.HashMap;

public class 로또의_최고순위와_최저순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = new int[2];
        int num = 0;
        int zero = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < lottos.length; i++){
            map.put(lottos[i], map.getOrDefault(map.get(lottos[i]), 0) + 1);
            if (lottos[i] == 0){
                zero++;
            }
        }

        for (int i = 0; i < win_nums.length; i++){
            if (map.get(win_nums[i]) != null){
                num++;
            }
        }
        
        answer[0] = 7 - num - zero;
        answer[1] = 7 - num;
        
        for (int i = 0; i < answer.length; i++){
            if (answer[i] == 7){
                answer[i] = 6;
            }
        }
    }
}

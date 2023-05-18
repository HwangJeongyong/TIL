// 2023/05/19
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 1; i <= n; i++) {
			map.put(i, 1);
		}

        Arrays.sort(lost);
		Arrays.sort(reserve);
		for (int i : lost)
			{map.put(i, map.get(i) - 1);}
		for (int i : reserve)
			{map.put(i, map.get(i) + 1);}
		map.put(map.size() + 1, 1);
		map.put(0, 1);
		
		for (int i = 0; i < reserve.length; i++) {
			if (map.get(reserve[i] - 1) == 0 && map.get(reserve[i]) == 2) {
				map.put(reserve[i] - 1, 1);
				map.put(reserve[i], 1);
			}
			if (map.get(reserve[i] + 1) == 0 && map.get(reserve[i]) == 2) {
				map.put(reserve[i] + 1, 1);
				map.put(reserve[i], 1);
			}
		}

		for (int i = 1; i <= n; i++) {
			if (map.get(i) != 0) {
				answer++;
			}
		}
    }
}

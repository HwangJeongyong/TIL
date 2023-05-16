// 2023/05/17
// https://school.programmers.co.kr/learn/courses/30/lessons/42576
package Programmers;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
		}
		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i]) - 1);
		}
		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) != 0) {
				answer = participant[i];
			}
		}
    }
}

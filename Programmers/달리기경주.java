// 2023/05/08
// https://school.programmers.co.kr/learn/courses/30/lessons/178871

package Programmers;

import java.util.HashMap;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        HashMap<String, Integer> map1 = new HashMap<String, Integer>(players.length);
		HashMap<Integer, String> map2 = new HashMap<Integer, String>(players.length);
		int num;
		String name;
		for (int i = 0; i < players.length; i++) {
			map1.put(players[i], i);
			map2.put(i, players[i]);
		}
		
		for (int i = 0; i < callings.length; i++) {
			num = map1.get(callings[i]);
			if (num == 0) {continue;}
			name = map2.get(num - 1);
			map1.put(callings[i], num - 1);
			map2.put(num, name);
			map2.put(num - 1, callings[i]);
            map1.put(name, num);
		}
		for (int i = 0; i < map2.size(); i++) {
			players[i] = map2.get(i);
		}
    }
}

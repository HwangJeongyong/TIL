// 2023/05/09
// https://school.programmers.co.kr/learn/courses/30/lessons/118666

package Programmers;

import java.util.HashMap;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String answer = "";
		char[] c = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(8);
		for (int i = 0; i < c.length; i++) {
			map.put(c[i], 0);
		}
		
		for (int i = 0; i < survey.length; i++) {
			switch(choices[i]) {
			case 1:
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 3);
				break;
			case 2:
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 2);
				break;
			case 3:
				map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 1);
				break;
			case 4:
				break;
			case 5:
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 1);
				break;
			case 6:
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 2);
				break;
			case 7:
				map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + 3);
				break;
			}
		}

		for (int i = 0; i < c.length; i += 2) {
			if (map.get(c[i]) >= map.get(c[i+1])) {
				answer += c[i];
			} else {
				answer += c[i+1];
			}
		}
    }
    
}

// 2023/05/05
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
package Programmers;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] answer = new int[id_list.length];
		String[] temp = new String[2];
		String[][] s = new String[id_list.length][id_list.length];
		
		for (int i = 0; i < report.length; i++) {
			temp = report[i].split(" ");
			if (!temp[0].equals(temp[1])) {
				for (int j = 0; j < id_list.length; j++) { 
					if (temp[1].equals(id_list[j])) {
						for (int l = 0; l < s[j].length; l++) {
							if (temp[0].equals(id_list[l])) {
								s[j][l] = temp[0];
							}
						}
					}
				}
			}
		}
		
		int cnt;
		
		for (int i = 0; i < s.length; i++) {
			cnt = 0;
			for (int j = 0; j < s[i].length; j++) {
				if (s[i][j] != null) {
					cnt++;
				}
			}
			if (cnt >= k) {
				for (int j = 0; j < s[i].length; j++) {
					if (s[i][j] != null) {
						answer[j]++;
					}
				}
			}
		}
    }
}

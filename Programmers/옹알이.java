// 2023/05/18
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
package Programmers;

public class 옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] s = { "aya", "ye", "woo", "ma" };
        String[] ss = new String[s.length];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = s[i] + s[i];
		}
		int answer = 0;
		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < s.length; j++) {
				babbling[i] = babbling[i].replace(ss[j], "1");
				babbling[i] = babbling[i].replace(s[j], " ");
			}
			babbling[i] = babbling[i].replace(" ","");
			if (babbling[i].equals("")) {
				answer++;
			}
		}
    }
}

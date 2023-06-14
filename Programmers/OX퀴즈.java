// 2023/06/12
// https://school.programmers.co.kr/learn/courses/30/lessons/120907
package Programmers;

public class OX퀴즈 {
    public static void main(String[] args) {
        String[] quiz ={"3 - 4 = -3", "5 + 6 = 11"};
        String[][] s = new String[quiz.length][5];
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			s[i] = quiz[i].split(" ");
			if (s[i][1].equals("+") && Integer.parseInt(s[i][4]) == Integer.parseInt(s[i][0]) + Integer.parseInt(s[i][2])) {
				answer[i] = "O";
			} else if (s[i][1].equals("-") && Integer.parseInt(s[i][4]) == Integer.parseInt(s[i][0]) - Integer.parseInt(s[i][2])) {
				answer[i] = "O";
			} else {
				answer[i] = "X";
			}
		}
    }
}

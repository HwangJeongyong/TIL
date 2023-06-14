// 2023/06/14
// https://school.programmers.co.kr/learn/courses/30/lessons/120863
package Programmers;

public class 다항식더하기 {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        String answer = "";
        String s2 = polynomial.replace("+", "");
		String[] s = s2.split("  ");
		int sum = 0;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("x")) {
				s[i] = "1000";
			} else {
				s[i] = s[i].replace("x", "000");
			}
			sum += Integer.parseInt(s[i]);
		}
		
		if (sum / 1000 == 0) {
			answer = sum + "";
		} else if (sum / 1000 == 1) {
			if (sum % 1000 == 0) {
				answer = "x";
			} else {
				answer = "x + " + sum%1000;
			}
		} else if (sum % 1000 == 0) {
			answer = sum / 1000 + "x";
		} else {
			answer = sum / 1000 + "x + " + sum % 1000;
		}
    }
}

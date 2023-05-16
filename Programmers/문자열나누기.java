// 2023/05/16
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
package Programmers;

public class 문자열나누기 {
    public static void main(String[] args) {
        String s = "banana";
        String[] sArr = s.split("");
		String s0 = "";
		int answer = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s0.equals("")) {
				s0 = sArr[i];
			}
			
			if (s0.equals(sArr[i])) {
				sum1++;
			} else {
				sum2++;
			}
			
			if (sum1 == sum2) {
				answer++;
				s0 = "";
				sum1 = 0;
				sum2 = 0;
			}
		}
		
		if (!s0.equals("")) {
			answer++;
		}
    }
}

// 2023/06/05
// https://school.programmers.co.kr/learn/courses/30/lessons/120808
package Programmers;

public class 분수의덧셈 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        int[] answer = {0,0};
		int num1 = numer1 * denom2 + numer2 * denom1;     
		int num2 = denom1 * denom2;

		if (num1 >= num2) {
			for (int i = num2; i > 1; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					num1 /= i;
					num2 /= i;
					break;
				}
			}
		} else {
			for (int i = num1; i > 1; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					num1 /= i;
					num2 /= i;
					break;
				}
			}

		}
		answer[0] = num1;
		answer[1] = num2;
    }
}

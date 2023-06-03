// 2023/06/03
// https://school.programmers.co.kr/learn/courses/30/lessons/120923
package Programmers;

public class 연속된수의합 {
    public static void main(String[] args) {
        int num = 3;
        int total = 12;
    int[] answer = new int[num];
		int sum = 0;
		
		for (int i = -50; i <= 1000; i++) {
			for (int j = i; j < i + num; j++) {
				sum += j;
			}
			if (sum == total) {
				for ( int k = 0; k < num; k++) {
					answer[k] = i + k;
				}
				break;
			}
			sum = 0;
		}
}
}

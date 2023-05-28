// 2023/05/28
// https://school.programmers.co.kr/learn/courses/30/lessons/120875
package Programmers;

public class 평행 {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int answer = 0;
        double[] slope = {0, 0, 0, 0, 0, 0};
		int cnt = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++ ) {
				slope[cnt] = ( ((double)(dots[j][0] - dots[i][0]) / (dots[j][1] -dots[i][1])));
				cnt++;
			}
		}
		
		cnt = 0;
		
		for (int i = 0; i < 3; i++) {
			if (slope[i] == slope[5 - i]) {
				cnt++;
			}
		}
		if (cnt > 0) {
			answer = 1; 
		} else {
            answer = 0;
        }
    }
}

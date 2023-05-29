// 2023/05/29
// https://school.programmers.co.kr/learn/courses/30/lessons/120876
package Programmers;

public class 겹치는선분의길이 {
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int answer = 0;
        int max = Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1]);
		int min = Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]);
        int abs = Math.abs(max - min);
		int[] line = new int[abs + 1];
		for (int j = 0; j < 3; j++) {
			for (int i = lines[j][0] - min; i < lines[j][1] - min; i++) {
				line[i]++;
			}
		}
		
		for (int i = 0; i < line.length; i++) {
			if(line[i] > 1) {
				answer++;
			}
		}
    }
}
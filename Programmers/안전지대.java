// 2023/05/30
// https://school.programmers.co.kr/learn/courses/30/lessons/120866
package Programmers;

public class 안전지대 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int answer = 0;
        int[][] map = new int[board.length + 2][board.length + 2];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 1) {
					map[i][j] = 1;
					map[i][j+1] = 1;
					map[i][j+2] = 1;
					map[i+1][j] = 1;
					map[i+1][j+1] = 1;
					map[i+1][j+2] = 1;
					map[i+2][j] = 1;
					map[i+2][j+1] = 1;
					map[i+2][j+2] = 1;
				}
			}
		}
		
		for (int i = 1; i < map.length -1; i++) {
			for (int j = 1; j < map.length -1; j++) {
				if ( map[i][j] == 0) {
					answer++;
				}
			}
		}
    }
}

// 2023/05/15
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
package Programmers;

import java.util.ArrayList;
import java.util.Stack;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int answer = 0;
		Stack<Integer> answerStack = new Stack<Integer>();
		ArrayList<Stack<Integer>> listStack = new ArrayList<Stack<Integer>>();

		for (int i = 0; i < board.length; i++) {
			listStack.add(new Stack<Integer>());
		}

		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					continue;
				}
				listStack.get(j).add(board[i][j]);
			}
		}

		for (int i = 0; i < moves.length; i++) {
			int move;
			if (!listStack.get(moves[i] - 1).isEmpty()) {
				move = listStack.get(moves[i] - 1).pop();
				if (!answerStack.isEmpty() && move == answerStack.peek()) {
					answerStack.pop();
					answer += 2;
				} else {
					answerStack.add(move);
				}
			}
		}
    }
}

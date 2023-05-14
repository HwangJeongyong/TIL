// 2023/05/14
// https://school.programmers.co.kr/learn/courses/30/lessons/67256

package Programmers;

import java.util.HashMap;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = "";

		int right = 30;
		int left = 32;
		HashMap<Integer, Integer> dial = new HashMap<Integer, Integer>(10);
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				dial.put(0, 31);
			} else {
				dial.put(i + 1, (i / 3) * 10 + i % 3);
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			int rightD = getDistance(right, dial.get(numbers[i])); 
			int leftD = getDistance(left, dial.get(numbers[i]));
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				left = dial.get(numbers[i]);
				answer += "L";
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				right = dial.get(numbers[i]);
				answer += "R";
			} else if (rightD == leftD) {
				switch(hand) {
				case "right":
					right = dial.get(numbers[i]);
					answer += "R";
					break;
				case "left":
					left = dial.get(numbers[i]);
					answer += "L";
					break;
				}
			} else if (rightD > leftD) {
				left = dial.get(numbers[i]);
				answer += "L";
			} else if (rightD < leftD) {
				right = dial.get(numbers[i]);
				answer += "R";
			}
		}
    }

    public static int getDistance(int num1, int num2) {
		return Math.abs((num1 / 10) - (num2 / 10)) + Math.abs((num1 % 10) - (num2 % 10));
	}
}

// 2023/05/20
// https://school.programmers.co.kr/learn/courses/30/lessons/131128
package Programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        String X = "5525";
        String Y = "1255";
        StringBuilder sb = new StringBuilder();

		String[] arrX = X.split("");
		Arrays.sort(arrX, Collections.reverseOrder());
		String[] arrY = Y.split("");
		Arrays.sort(arrY, Collections.reverseOrder());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arrX.length; i++) {
			map.put(arrX[i], map.getOrDefault(arrX[i], 0) + 1);
		}
		for (int i = 0; i < arrY.length; i++) {
			if (map.get(arrY[i]) != null) {
				if (map.get(arrY[i]) > 0) {
					map.put(arrY[i], map.get(arrY[i]) - 1);
					sb.append(arrY[i]);
				}
			}
		}
		String answer = sb.toString();
		answer = answer.replaceAll("^[0]{2,}","0");
        if (answer.equals("")) {
			answer = "-1";
		}
    }
}

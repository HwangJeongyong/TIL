// 2023/06/13
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
package Programmers;

public class 최빈값구하기 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        int answer = 0;
        int[] freq = new int[1001];
		int max = -1;
		int maxNum = 0;
		int cnt = 0;
		
		for (int i = 0; i < array.length; i++) {
			freq[array[i]]++;
			if(max <= freq[array[i]])
			max = freq[array[i]];
		}

		for (int i = 0; i < freq.length; i++) {
			if(max == freq[i]) {
				cnt++;
				maxNum = i;
			}
		}
		if (cnt > 1) {
			answer = -1;
		} else {
			answer = maxNum;
		}
    }
}

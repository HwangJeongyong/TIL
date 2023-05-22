// 2023/05/22
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
package Programmers;

public class 기사단원의_무기 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;
        int cnt = 0;
		int answer = 0;
		int squareRoot = 0;

		
		for (int j = 1; j <= number; j++){
			cnt = 0;
			for (int i = 1; i <= j; i++) {
				if (i * i > j) {
					squareRoot = i - 1;
					break;
				}
			}
			for (int i = 1; i <= squareRoot; i++) {
				if(j % i == 0) {
					cnt += 2;
				}
			}
			if (j == squareRoot * squareRoot){
				cnt--;
			}

			if (cnt > limit)
            { cnt = power;}
			answer += cnt;
		}
    }
}

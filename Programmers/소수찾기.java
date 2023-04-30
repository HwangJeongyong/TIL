// 2023/04/30
// https://school.programmers.co.kr/learn/courses/30/lessons/12921

package Programmers;

public class 소수찾기 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean sw = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    sw = false;
                    break;
                }
            }
            if (sw) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

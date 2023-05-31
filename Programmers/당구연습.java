// 2023/06/01
// https://school.programmers.co.kr/learn/courses/30/lessons/169198
package Programmers;

import java.util.Arrays;

public class 당구연습 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int startX = 3; 
        int startY = 7;
        int[][] balls = {{7, 7}, {2, 7}, {7, 3}};

        int[] answer = new int[balls.length];

        for (int i = 0; i < answer.length; i++) answer[i] = Integer.MAX_VALUE;

        for (int i = 0; i < balls.length; i++){
            int temp;
            temp = (startX + balls[i][0]) * (startX + balls[i][0]) + (startY - balls[i][1]) * (startY - balls[i][1]);
            if (temp < answer[i] && !(startY == balls[i][1] && startX > balls[i][0])) {
                answer[i] = temp;
            }
            temp = (startX - balls[i][0]) * (startX - balls[i][0]) + (startY + balls[i][1]) * (startY + balls[i][1]);
            if (temp < answer[i] && !(startX == balls[i][0] && startY > balls[i][1])) {
                answer[i] = temp;
            }
            temp = (startX + balls[i][0] - 2 * m) * (startX + balls[i][0] - 2 * m) + (startY - balls[i][1]) * (startY - balls[i][1]);
            if (temp < answer[i] && !(startY == balls[i][1] && startX < balls[i][0])) {
                answer[i] = temp;
            }
            temp = (startX - balls[i][0]) * (startX - balls[i][0]) + (startY + balls[i][1] - 2 * n) * (startY + balls[i][1] - 2 * n);
            if (temp < answer[i] && !(startX == balls[i][0] && startY < balls[i][1])) {
                answer[i] = temp;
            }
            temp = (startX + balls[i][0]) * (startX + balls[i][0]) + (startY + balls[i][1] - 2 * n) * (startY + balls[i][1] - 2 * n);
            if (temp < answer[i] && (double)(startY + balls[i][1] - 2 * n)/(startX + balls[i][0]) != (double)(startY - balls[i][1])/(startX - balls[i][0])) {
                answer[i] = temp;
            }
            temp = (startX + balls[i][0]) * (startX + balls[i][0]) + (startY + balls[i][1]) * (startY + balls[i][1]);
            if (temp < answer[i] && (double)(startY + balls[i][1])/(startX + balls[i][0]) != (double)(startY - balls[i][1])/(startX - balls[i][0])) {
                answer[i] = temp;
            }
            temp = (startX + balls[i][0] - 2 * m) * (startX + balls[i][0] - 2 * m) + (startY + balls[i][1]) * (startY + balls[i][1]);
            if (temp < answer[i] && (double)(startY + balls[i][1])/(startX + balls[i][0] - 2 * m) != (double)(startY - balls[i][1])/(startX - balls[i][0])) {
                answer[i] = temp;
            }
            temp = (startX + balls[i][0] - 2 * m) * (startX + balls[i][0] - 2 * m) + (startY + balls[i][1] - 2 * n) * (startY + balls[i][1] - 2 * n);
            if (temp < answer[i] && (double)(startY + balls[i][1] - 2 * n)/(startX + balls[i][0] - 2 * m) != (double)(startY - balls[i][1])/(startX - balls[i][0])) {
                answer[i] = temp;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}

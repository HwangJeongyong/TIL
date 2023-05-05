// 2023/05/01
// https://school.programmers.co.kr/learn/courses/30/lessons/42840

package Programmers;

import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answer;
        int[] answers = { 1, 2, 3, 4, 5 };
        int[] p1 = { 1, 2, 3, 4, 5 };
        int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]){
                s1++;
            }
            if (answers[i] == p2[i % p2.length]){
                s2++;
            }
            if (answers[i] == p3[i % p3.length]){
                s3++;
            }
        }

        if (s1 > s2 && s1 > s3){
            answer = new int[1];
            answer[0] = 1;
        } else if (s2 > s1 && s2 > s3){
            answer = new int[1];
            answer[0] = 2;
        } else if (s3 > s1 && s3 > s2){
            answer = new int[1];
            answer[0] = 3;
        } else if (s1 == s2 && s1 > s3){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
        } else if (s1 == s3 && s1 > s2){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
        } else if (s2 == s3 && s2 > s1){
            answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
        } else if (s1 == s2 && s2 == s3){
            answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        } else {
            answer = new int[0];
        }
        System.out.println(Arrays.toString(answer));
    }

}

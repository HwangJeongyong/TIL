// 2023/04/28 풀이
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
package Programmers;

import java.util.Arrays;

public class 과일장수 {
    public static void main(String[] args) {
        int k = 3;
        int m = 3;
        int[] score = { 1, 2, 3};
        Arrays.sort(score);
        int sum = 0;
        for (int i = score.length -1 ; i > score.length % m - 1; i-=m){
            sum += score[i - m + 1] * m;
        }
        System.out.println(sum);
    }

}

// 
// https://school.programmers.co.kr/learn/courses/30/lessons/12941
package Programmers;

import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
        int []A = {1, 4, 2};
        int []B = {5, 4, 4};

        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++){
            sum += A[i] * B[B.length - 1 - i];
        }
        System.out.println(sum);
    }
}

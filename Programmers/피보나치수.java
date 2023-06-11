// 2023/06/11
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
package Programmers;

public class 피보나치수 {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++){
                arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
            }
    
            int answer = arr[n];
        
    }
}

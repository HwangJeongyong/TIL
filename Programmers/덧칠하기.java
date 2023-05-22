// 2023/05/23
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
package Programmers;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int[] section = {1, 3};
        int answer = 0;
        int[] arrN = new int[n];

        for (int i = 0; i < section.length; i++){
            arrN[section[i] - 1] = 1;
        }

        for (int i = 0; i < n; i++){
            if(arrN[i] == 1){
                i += m - 1;
                answer++;
            }
        }
    }
}

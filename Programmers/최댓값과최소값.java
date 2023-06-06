// 
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
package Programmers;

public class 최댓값과최소값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String[] arrS = s.split(" ");
        int[] arrI = new int[arrS.length];
        for (int i = 0; i < arrS.length; i++){
            arrI[i] = Integer.parseInt(arrS[i]);
        }
        int max = arrI[0];
        int min = arrI[0];

        for (int i = 0; i < arrI.length; i++){
            if (max < arrI[i]) {
                max = arrI[i];
            }
            if (min > arrI[i]) {
                min = arrI[i];
            }
        }

        String answer = min + " " + max;

        System.out.println(answer);
    }
}

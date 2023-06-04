// 2023/06/04
// https://school.programmers.co.kr/learn/courses/30/lessons/120924
package Programmers;

public class 다음에올숫자 {
    public static void main(String[] args) {
        int[] common = {1, 2, 3, 4};
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length - 1] + common[1] - common[0];
        } else {
            answer = common[1] / common[0] * common[common.length - 1];
        }
    }
}

// 2023/06/07
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
package Programmers;

public class 올바른괄호 {
    public static void main(String[] args) {
        String s = "()()";
        boolean answer = true;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                cnt++;
            } else if (s.charAt(i) == ')') {
                cnt--;
            }
            if (cnt < 0) {
                break;
            }
        }

        if (cnt != 0) {
            answer = false;
        }
    }
}

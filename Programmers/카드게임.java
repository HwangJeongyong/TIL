// 2023/05/03
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
package Programmers;
public class 카드게임 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String answer = "";
        int c1 = 0;
        int c2 = 0;
        int g = 0;

        for (int i = 0; i < goal.length; i++) {
            if (c1 <= cards1.length - 1 && cards1[c1].equals(goal[i])) {
                c1++;
                g++;
                continue;
            }

            if (c2 <= cards2.length - 1 && cards2[c2].equals(goal[i])) {
                c2++;
                g++;
            }
        }

        if (g != goal.length) {
            answer = "No";
        } else {
            answer = "Yes";
        }
    }
    
}

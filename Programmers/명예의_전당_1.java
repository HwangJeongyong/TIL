package Programmers;
// 2023/04/28
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
import java.util.ArrayList;
import java.util.Collections;

public class 명예의_전당_1 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++){
            if (i < k) {
                list.add(score[i]);
                Collections.sort(list);
            } else if (list.get(0) < score[i]) {
                list.set(0, score[i]);
                Collections.sort(list);
            }
            answer[i] = list.get(0);
        }
    }
}

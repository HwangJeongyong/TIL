// 2023/05/04
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
package Programmers;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) set.add(i);
        if (set.size() < nums.length / 2){
            answer = set.size();
        } else{
            answer = nums.length / 2;
        }
    }
    
}

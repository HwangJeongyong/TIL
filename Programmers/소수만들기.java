// 2023/04/30
// https://school.programmers.co.kr/learn/courses/30/lessons/12977

package Programmers;

import java.util.ArrayList;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for (int i = 0; i < list.size(); i++){
            boolean sw = true;
            for (int j = 2; j <= Math.sqrt(list.get(i)); j++){
                if (list.get(i) % j ==0){
                    sw = false;
                    break;
                }
                
            }
            if (sw){
                answer++;
            }
        }
        System.out.println(answer);
    }
    
}

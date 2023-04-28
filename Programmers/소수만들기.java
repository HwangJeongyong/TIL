// 2023/04/28
// https://school.programmers.co.kr/learn/courses/30/lessons/12977

package Programmers;

import java.util.Arrays;
import java.util.HashSet;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        System.out.println(set);
        int max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        for (int i = 2; i <= max; i++){
            boolean sw = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j ==0){
                    sw = false;
                    break;
                }
                
            }
            if (sw && set.contains(i)){
                answer++;
            }
        }
    }
    
}

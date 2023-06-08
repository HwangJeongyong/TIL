// 2023/06/09
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
package Programmers;

import java.util.Arrays;

public class 이진변환만들기 {
    public static void main(String[] args) {
        String s = "01110";
        int[] answer = {0, 0};
        while(true){
            answer[0]++;
            int dif = s.length() - s.replace("0", "").length();
            if (dif != 0) {
                answer[1] += dif;
                s = s.replace("0", "");
            }
            
            String s2 = "";
            int num = s.length();
            if (num == 1){
                break;
            }
            System.out.println("1 : " + s);
            int bi = 1;
            while(num >= bi) {
                bi *= 2;
            }
            for (int i = bi/2; i > 0; i/=2){
                if (num >= i) {
                    num -= i;
                    s2 += "1";
                } else {
                    s2 += "0";
                }
            }

            s = s2;
            System.out.println("2 : " + s);
        }
        System.out.println(Arrays.toString(answer));
        
        
    }
}

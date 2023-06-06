// 
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
package Programmers;

public class 이진변환만들기 {
    public static void main(String[] args) {
        String s = "110010101001";
        int[] answer = {0, 0};
        while(true){
            int dif = s.length() - s.replace("0", "").length();
            if (dif != 0) {
                answer[1] += dif;
            }
            answer[0]++;
            s = s.replace("0", "");
            
            String s2 = "";
            int num = s.length();
            if (num == 1){
                break;
            }
            int bi = 1;
            while(num > bi) {
                bi *= 2;
            }
            for (int i = bi/2; i > 0; i/=2){
                if (num > i) {
                    num -= i;
                    s2 += "1";
                } else {
                    s2 += "0";
                }
            }

            s = s2;
        }


    }
}

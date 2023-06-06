// 
// https://school.programmers.co.kr/learn/courses/30/lessons/148652
package Programmers;

public class 유사_칸토어_비트열 {
    public static void main(String[] args) {
        int n = 2;
        long l = 4;
        long r = 17;
        StringBuilder sb0 = new StringBuilder("1"); 

        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sb0.length(); j++){
                if(sb0.charAt(j) == '1'){
                    sb.append("11011");
                } else {
                    sb.append("00000");
                }
            }
            sb0 = sb;
        }
        String answer = sb0.substring((int)l - 1, (int)r);
        int cnt = 0;

        cnt = answer.replace("0", "").length();

        System.out.println(cnt);
    }
}
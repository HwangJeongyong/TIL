// 2023/05/31
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
package Programmers;

import java.util.Arrays;

public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        String s = " for  the  last  week ";
        String answer = "";
        // s = s.replaceAll(" {1,}", " ");
        String s2 = s.toLowerCase();

        for (int i = 0; i < s2.length(); i++){
            if (s2.charAt(0) >= 97 && s2.charAt(0) <= 122 && s2.charAt(i - 1) == ' '){
                s2.replace(answer, s2);
                //s2.charAt(i) = (char)((int)s2.charAt(i) - 32);
            }
        }
        s2 = s2.replaceAll("^ {1,}", "");
        s2 = s2.replaceAll(" {1,}$", "");
        String[] arrS = s2.split(" {1,}");
        System.out.println(Arrays.toString(arrS));
        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i].charAt(0) >= 97 && arrS[i].charAt(0) <= 122) {
                String str = "";
                char c = arrS[i].charAt(0);
                c = (char) ((int) c - 32);
                str += c;
                str += arrS[i].substring(1, arrS[i].length());
                arrS[i] = str;
            }
        }

        String[] arrS2 = s.split("[a-zA-Z1-9]{1,}");
        for (int i = 0; i < arrS.length; i++){
            answer += arrS2[i];
            answer += arrS[i];
        }

        if (arrS.length != arrS2.length) {
            answer += arrS2[arrS2.length - 1];
        }
        System.out.println(answer);

    }
}

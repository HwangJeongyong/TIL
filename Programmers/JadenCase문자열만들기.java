// 2023/05/31
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
package Programmers;


public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        String s = "  people       unFollowed me   ";
        String answer = "";
        s = s.replaceAll(" {1,}", " ");
        System.out.println(s);
        String[] arrS = s.split(" ");
        System.out.println(arrS[0]);
        for (int i = 0; i < arrS.length; i++){
            arrS[i] = arrS[i].toLowerCase();
            if (arrS[i].charAt(0) >= 97 && arrS[i].charAt(0) <= 122){
                char c = arrS[i].charAt(0);
                c = (char) ((int)c - 32);
                answer += c;
                answer += arrS[i].substring(1, arrS[i].length());
            } else {
                answer += arrS[i];
            }
            if (i < arrS.length - 1) {
                answer += " ";
            }
        }
        System.out.println(answer);

    }
}

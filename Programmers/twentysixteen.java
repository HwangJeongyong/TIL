// 2023/05/13
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
package Programmers;

public class twentysixteen {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int num = 0;
        for (int i = 1; i < a; i++){
            num += months[i - 1];
        }
        num += b;
        num = num % 7 - 1;
        if (num == -1){
            num = 6;
        }
        String answer = day[num];
        System.out.println(answer);

    }
    
}

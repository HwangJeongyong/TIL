// 2023/04/26 풀이
// https://school.programmers.co.kr/learn/courses/30/lessons/17682

public class 다트_게임 {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        int answer = 0;
        int index = -1;
        int[] intArr = new int[3];

        for (int i = 0; i < dartResult.length(); i++){
            if(dartResult.charAt(i) == 49 && dartResult.charAt(i+1) == 48){
                index++;
                intArr[index] = 10;
                i++;
            } else if (dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57){
                index++;
                intArr[index] = dartResult.charAt(i) - 48;
            } else if (dartResult.charAt(i) == 'D'){
                intArr[index] *= intArr[index];
            } else if (dartResult.charAt(i) == 'T'){
                intArr[index] *= intArr[index] * intArr[index];
            } else if (dartResult.charAt(i) == '*'){
                if (index == 0){
                    intArr[index] *= 2;
                } else {
                    intArr[index] *= 2;
                    intArr[index - 1] *= 2;
                }
            } else if (dartResult.charAt(i) == '#'){
                intArr[index] *= -1;
            }
        }

        for (int i = 0; i < intArr.length; i++){
            answer += intArr[i];
        }

        System.out.println(answer);

    }
}

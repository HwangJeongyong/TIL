// 2023/04/27 풀이
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
// 퀵 정렬
package Programmers;

import java.util.Arrays;

public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
        int[] answer = new int[N];
        double[] stageFailedRate = new double[N+1];
        double[] sortedStageFailedRate = new double[N+1];
        int[] stageReached = new int[N+1];
        int[] stageReachedTotal = new int[N+1];

        for (int i = 0 ; i < stages.length ; i++) {
            int reached = ((int)stages[i]%(N+1));
            stageReached[reached]++; 

            if (reached == 0) {
                for (int j = 1 ; j <= N ; j++) {
                    stageReachedTotal[j]++;
                }
            }
            else {
                for (int j = 1 ; j <= reached ; j++) {
                    stageReachedTotal[j]++;
                }
            }
        }

        for (int i = 1 ; i <= N ; i++) {
            if (stageReachedTotal[i] != 0) {
                stageFailedRate[i] = (double)stageReached[i]/(double)stageReachedTotal[i];
            }
            else {
                stageFailedRate[i] = 0;
            }
            sortedStageFailedRate[i] = stageFailedRate[i];
        }
        stageFailedRate[0] = -1;
        sortedStageFailedRate[0] = 10;

        Arrays.sort(sortedStageFailedRate);

        for (int i = 1 ; i <= N ; i++) {
            for (int j = 1 ; j <= N ; j++) {
                if (sortedStageFailedRate[N-i] == stageFailedRate[j] ) {
                    answer[i-1] = j;
                    sortedStageFailedRate[N-i] = 10;
                    stageFailedRate[j] = -1;
                    break;
                }
            }
        }
        
    }

}

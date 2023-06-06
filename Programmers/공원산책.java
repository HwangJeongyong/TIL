// 
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
package Programmers;

import java.util.Arrays;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        int[] result = {0, 0};
        for (int i = 0; i < park.length; i++){
            for (int j = 0; j < park[0].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++){
            String[] route = routes[i].split(" ");
            int[] result2 = {result[0], result[1]};
            boolean out = false;
            for (int j = 0; j < Integer.parseInt(route[1]); j++){
                int[] temp = {result[0], result[1]};
                switch(route[0]){
                    case "N":
                        if (result[0] != 0){
                            if (park[result[0] - 1].charAt(result[1]) != 'X'){
                                result[0]--;
                            }
                        }
                        break;
                        case "S":
                        if (result[0] != park.length - 1){
                            if (park[result[0] + 1].charAt(result[1]) != 'X'){
                                result[0]++;
                            }
                        }
                        break;
                        case "W":
                        if (result[1] != 0){
                            if (park[result[0]].charAt(result[1] - 1) != 'X'){
                                result[1]--;
                            }
                        }
                        break;
                        case "E":
                        if (result[1] != park[0].length() - 1){
                            if (park[result[0]].charAt(result[1] + 1) != 'X'){
                                result[1]++;
                            }
                        }
                        break;
                }
                if (result[0] == temp[0] && result[1] == temp[1]) {
                    out = true;
                }
            }

            if (out){
                result[0] = result2[0];
                result[1] = result2[1];
            }
        }

        System.out.println(Arrays.toString(result));

    }
}

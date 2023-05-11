// 2023/05/11
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
package Programmers;

public class 대충만든자판 {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        
        int[] answer = new int[targets.length];

		int min;
		boolean isExist;
		
		for (int i = 0; i < targets.length; i++) { // targets 행
			
			for (int j = 0; j < targets[i].length(); j++) { // targets 열
				min = 101;
				isExist = false;
				for (int k = 0; k < keymap.length; k++) { // keymap 행
					
					for (int l = 0; l < keymap[k].length(); l++) { // keymap 열
						if (targets[i].charAt(j) == keymap[k].charAt(l) && l + 1 < min) {
							
							min = l + 1;
							isExist = true;
							break;
						} 
					}
				}
				
				if (isExist) {answer[i] += min;}
				else {answer[i] = -1000000;}
			}
		}
        for (int i = 0; i < answer.length; i++) {
			if (answer[i] < 0) {
				answer[i] = -1;
			}
		}
    }
}

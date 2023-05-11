// 2023/05/12
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
package Programmers;

public class 둘만의암호 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        int num = index;
		int[] skipInt = new int[skip.length()];
		int[] sInt = new int[s.length()];
		
		for (int i = 0; i < skipInt.length; i++) {
			skipInt[i] = skip.charAt(i);
		}
		for (int i = 0; i < sInt.length; i++) {
			sInt[i] = s.charAt(i);
		}
		
		for (int i = 0; i < sInt.length; i++) {
			num = index;
			for (int j = 0; j < num; j++) {
				sInt[i]++;
				if (sInt[i] > 122) {
					sInt[i] -= 26;
				}
				for (int k = 0; k < skipInt.length; k++) {
					if (sInt[i] == skipInt[k]) {
						j--;
						break;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sInt.length; i++) {
			sb.append((char)sInt[i]);
		}
        String answer = sb.toString();
    }
}

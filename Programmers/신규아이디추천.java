// 2023/05/13
// https://school.programmers.co.kr/learn/courses/30/lessons/72410
package Programmers;

import java.util.ArrayList;

public class 신규아이디추천 {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = "";
        ArrayList<Integer> c = new ArrayList<Integer>(new_id.length());
        for (int i = 0; i < new_id.length(); i++) {
			c.add((int) new_id.charAt(i));
		}
		
		// 1번
		for (int i = 0; i < c.size(); i++) {   
			if (c.get(i) >= 65 && c.get(i) <= 90) {
				c.set(i, c.get(i) + 32);
			}
		}
		
		// 2번
		for (int i = 0; i < c.size(); i++) { 
			if (c.get(i) >= 48 && c.get(i) <= 57) {
				continue;
			} else if(!(c.get(i) == 45 || c.get(i) == 46 || c.get(i) ==  95 || (c.get(i) >= 97 && c.get(i) <= 122))) {
				c.remove(i);
				i--;
			}
		}
		
		// 3번
		for (int i = 0; i < c.size() - 1; i++) { 
			if (c.get(i) == 46 && c.get(i + 1) == 46) {
				c.remove(i);
				i--;
			}
		}
		
		// 4번
		if (c.get(0) == 46) {                     
			c.remove(0);
		}
		if (c.size() > 0) {
			if (c.get(c.size() -1) == 46) {
				c.remove(c.size() - 1);
			}
		}
		
		// 5번
		if (c.isEmpty()) {                        
			c.add(97);
		}
		
		// 6번
		if (c.size() >= 16) {
			while(c.size() >= 16) {
				c.remove(c.size() - 1);
			}
			if (c.get(c.size() -1) == 46) {
				c.remove(c.size() - 1);
			}
		}
		
		// 7번
		if (c.size() <= 2) {
			while (c.size() < 3) {
				c.add(c.get(c.size() - 1));
			}
		}
		
		for (int i = 0; i < c.size(); i++) {
			answer += (char)c.get(i).intValue();
		}
    }
}

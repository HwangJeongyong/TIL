package Programmers;
// 2023/05/07
// 
public class 개인정보_수집_유효기간{
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int cnt = 0;
		String temp = "";
		
		for (int i = 0; i < privacies.length; i++) {
			if (convertDate(today) >= convertDate(privacies[i], terms)) {
				cnt++;
				temp += i + 1 +",";
			}
		}
		int[] answer = new int[cnt];
		
		String[] temp2 = temp.split(",");
		
		for (int i = 0; i < temp2.length; i++) {
			answer[i] = Integer.parseInt(temp2[i]);
		}
    }
    
    public static int convertDate(String date) {
		String[] s = date.replace(".", " ").split(" ");
		int result = Integer.parseInt(s[0]) * (28 * 12) + Integer.parseInt(s[1]) * 28 + Integer.parseInt(s[2]);
		return result;
	}
	
	public static int convertDate(String date, String[] terms) {
		String[] s = date.replace(".", " ").split(" ");
		int result = Integer.parseInt(s[0]) * (28 * 12) + Integer.parseInt(s[1]) * 28 + Integer.parseInt(s[2]);
		String[][] s2 = new String[terms.length][2];
		for (int i = 0; i < s2.length; i++) {
			s2[i] = terms[i].split(" ");
		}
		for (int i = 0; i < s2.length; i++) {
			if (s[3].equals(s2[i][0])) {
				result += Integer.parseInt(s2[i][1]) * 28;
			}
		}
		return result;
    }
}
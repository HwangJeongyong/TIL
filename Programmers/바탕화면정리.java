// 2023/05/06
// https://school.programmers.co.kr/learn/courses/30/lessons/161990

package Programmers;

public class 바탕화면정리{
    public static void main(String[] args) {
        String[] wallpaper ={".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        int[] answer = new int[4]; // xmin xmax ymin ymax
		boolean sw = false;

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if (wallpaper[i].charAt(j) == '#') {
					answer[0] = i;
					answer[1] = j;
					answer[2] = i;
					answer[3] = j;
					sw = true;
					break;
				}
			}
			if (sw) {
				break;
			}
		}
		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if (wallpaper[i].charAt(j) == '#') {
					answer[0] = answer[0] > i ? i : answer[0];
					answer[1] = answer[1] > j ? j : answer[1];
					answer[2] = answer[2] < i + 1 ? i + 1 : answer[2];
					answer[3] = answer[3] < j + 1 ? j + 1 : answer[3];
				}
				
			}
		}
    }
}
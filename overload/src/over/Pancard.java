package over;

import java.util.*;

public class Pancard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String n = sc.nextLine();
		/*
		 * String s="ABCDE1234Z"; String t="ansnkankkr";
		 */
		int c1 = 0;
		char c[] = n.toCharArray();
		for (int i = 0; i <= 4; i++) {
			if (!('A' <= c[i] && c[i] <= 'Z')) {
				c1 = 1;
			}
		}
		for (int i = 5; i <= 8; i++) {
			if (!('1' <= c[i] && c[i] <= '9')) {
				c1 = 1;
			}
		}
		if (('A' <= c[9] && c[9] <= 'Z') && c1 == 0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

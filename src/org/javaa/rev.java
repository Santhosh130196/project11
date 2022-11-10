package org.javaa;

import java.util.Scanner;

public class rev {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int numb = sc.nextInt();
	int rev=0;
	while (numb!=0) {
		rev=rev*10+numb%10;
		numb = numb/10;
	}
	System.out.println(rev+"is a reverse number");
}
}

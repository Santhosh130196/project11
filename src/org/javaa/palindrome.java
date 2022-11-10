package org.javaa;

public class palindrome {
public static void main(String[] args) {
	int a = 12321;
	int tem=a;
	int rev=0;
	while (a>0) {
		int an=a%10;
		rev=rev*10+an;
		a=a/10;
		
	}if (rev==tem) {
		System.out.println(rev+" is a palindrome");
	} else {
		System.out.println(rev+" is not a palindrome");
	}
}
}

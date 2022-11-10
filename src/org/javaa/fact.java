package org.javaa;

public class fact {
public static void main(String[] args) {
	int a=4;
	int fact=1;
	while(a>0) {
		fact=fact*a;
		a-=1;
		
	}
	System.out.println(fact);
}
}

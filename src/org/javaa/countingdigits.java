package org.javaa;

public class countingdigits {
public static void main(String[] args) {
	int a=54321;
	int count=0;
	while(a>0) {
		a=a/10;
		count++;
	}
	System.out.println(count+"number of digits");
}
}

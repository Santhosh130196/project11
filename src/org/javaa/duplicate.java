package org.javaa;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicate {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=90;
	a[1]=20;
	a[2]=50;
	a[3]=20;
	a[4]=80;
	Set<Integer>s=new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		s.add(a[i]);
	}
	for (Integer x : s) {
		System.out.println(x);
	}
}
}

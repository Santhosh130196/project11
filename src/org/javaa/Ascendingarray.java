package org.javaa;

import java.util.HashSet;
import java.util.Set;

public class Ascendingarray {
public static void main(String[] args) {
int a[]=new int[5];
a[0]=12;
a[1]=13;
a[2]=82;
a[3]=89;
a[4]=9;

for (int i = 0; i < a.length; i++) {
	
	for (int j = i+1; j < a.length; j++) {
		if (a[i]<a[j]) {
			int tem=a[i];
			a[i]=a[j];
			a[j]=tem;
		}
	}
}
	
System.out.println(a[3]);
}
}






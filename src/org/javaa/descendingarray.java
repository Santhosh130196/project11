package org.javaa;

public class descendingarray {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=9;
	a[1]=7;
	a[2]=91;
	a[3]=89;
	a[4]=97;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				int tem=a[i];
				a[i]=a[j];
				a[j]=tem;
			}
		}
	}System.out.println(a[0]);
	}
	
}


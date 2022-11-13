package org.javaa;

public class armstrong {
public static void main(String[] args) {
	int n =153;
int	tem=n;
int arm=0;
while(n>0) {
	int an=n%10;
	arm=arm+(an*an*an);
	n=n/10;
}
if (arm==tem) {
	System.out.println("is armstrong");
} else {
	System.out.println("is not armstrong");
	System.out.println("sandyupdated");
	System.out.println("luffy");
}
}
}

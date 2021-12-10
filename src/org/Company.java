package org;

public class Company {
public static void main(String[] args) {
	
int a[] = new int	[4];
a[0]=30;
a[1]=10;
a[2]=20;
a[3]=50;
System.out.println(a[3]);
int length = a.length;
System.out.println(length);
for (int i = 0; i < 4; i++) {
	System.out.println(a[i]);
	
}
	System.out.println("enhanced for loop");
	for (int i : a) {
System.out.println(i);

	} 
	
	
}
}

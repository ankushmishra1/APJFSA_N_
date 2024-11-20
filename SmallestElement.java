package com.githib;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,6,4,1,5};
		
		int smallest = a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println(smallest);

	}

}

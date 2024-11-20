package com.githib;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,3,2,9};
		int largest = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println(largest);

	}

}

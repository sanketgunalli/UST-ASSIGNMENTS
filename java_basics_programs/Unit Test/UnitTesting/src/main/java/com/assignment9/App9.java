package com.assignment9;


public class App9 {
	
	public static boolean listHaveTheElement(int k) {
		int [] l1 = {1,2,3,4,5};
		for(int i=0;i<l1.length;i++) {
			if(l1[i]==k) {
				return true;
			}
		}
		return false;
	}
}

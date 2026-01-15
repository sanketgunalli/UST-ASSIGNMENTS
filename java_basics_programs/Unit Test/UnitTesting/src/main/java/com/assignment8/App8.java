package com.assignment8;

import java.util.ArrayList;
import java.util.List;

public class App8 {
	public static boolean listSizeThree(int n) {
		List<String> l =new ArrayList<>(); 
		for(int i=0;i<n;i++) {
			l.add("Item "+i);
		}
		return l.size()==3;
	}
}

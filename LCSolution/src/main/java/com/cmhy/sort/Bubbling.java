package com.cmhy.sort;

public class Bubbling {
	public static void sort(int []array){
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j ++){
				if(array[i] > array[j]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int []array = new int []{2,5,6,9,8,56,89,0,32};
		sort(array);
		for(int i:array){
			System.out.println(i);
		}
	}
}

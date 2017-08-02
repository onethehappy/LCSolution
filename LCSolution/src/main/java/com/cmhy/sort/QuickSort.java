package com.cmhy.sort;

public class QuickSort {
	public void quickSort(int []array){
		if(array.length > 0){
			quick(array,0,array.length-1);
		}
	}
	public void quick(int[]array, int low, int high){
		int middle = getMiddle(array,0,array.length-1);
		quick(array,low,middle);
		quick(array,middle+1,high);
	}
	public int getMiddle(int[]array, int low, int high){
		int tmp = array[low];
		while(low < high && array[low] < array[high]){
			high--;
		}
		array[low] = array[high];
		while(low < high && array[low] < array[high]){
			low++;
		}
		array[high] = tmp;
		return low;
	}
}

package com.cmhy.iteration;

public class FibonacciSequence {
	public static int fsFun(int index) throws Exception{
		if(index ==0){
			return 1;
		}else if(index == 1){
			return 1;
		}else{
			return fsFun(index-1)+fsFun(index-2);
		}
	}
	public static void main(String[] args) {
		
		try {
			System.out.println(fsFun(3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.learn.day0722;

public class PsssOfSeven {

	/**
	 * ·êÆß¹ý
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=100){
			if(i%7==0 || i%10==7 || i/10==7){
				System.out.print("¹ý"+" ");
			}else{
				System.out.print(i+" ");
			}
			i++;
		}
	}

}

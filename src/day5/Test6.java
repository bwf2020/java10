package day5;

import java.util.Iterator;

public class Test6 {


	static int i=0;
	
	
	public static void main(String[] args) {
		
	
		
		/*while(i<5) {
			
			System.out.println("************");
			i++;
			
		};*/
		
		do {
			
			System.out.println("==========");
			i++;
			
		}while(i<5);
		
		
		
		
		int[] array= {3,6,11,46,86};
		
		/*array[0]=array[0]*2;
		array[1]=array[1]*2;
		array[2]=array[2]*2;
		array[3]=array[3]*2;
		array[4]=array[4]*2;
		
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);*/
		
		
		for(int i=0;i<array.length;i++) {
			
			
			array[i]=array[i]*2;
			
		}
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]); 
		
		}
		
		
		for(int i=0;i<5;i++) {
			
			
			for(int k=0;k<i+1;k++){
				
				System.out.print("*"); 
				
			}
			
			System.out.println("");
			
			
		}

		
		//增强版的循环 
		for (int i : array) {
			
			System.out.println("数组中的值："+i);
		}
		
		for (int i : array) {
			
			i+=1;
			System.out.print("");
			
		}
		
		for (int i : array) {
			
			System.out.println("数组中的值："+i);
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i]+=1;
			System.out.print("");
		}
		
		for (int i : array) {
			
			System.out.println("数组中的值："+i);
		}
		
	}
	
	
}

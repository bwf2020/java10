package day5;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {


		
		int[][] a=new int[5][2];
		
		System.out.println(a);
		
		
		int[][] b=new int[][] {{2,3},{5,6},{9,2},{4},{2,5,8,33,67}};
		
		System.out.println(b);
		
		
		a[0]= new int[]{100,3};
		
		int[] a1= {2,6};
		a[1]=a1;
		
		System.out.println(a);
		
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		
		
		int[] array=new int[2];
		
		array[0]=11;
		array[1]=3;
		
		System.out.println("初始长度"+array.length);
		
		int[] array2=new int[array.length*2];
		
		System.arraycopy(array, 0, array2, 0, array.length);
		
	
		System.out.println(array2);
		
		array2[2]=55;
		
		array=array2;//证明把以前的老数组扩容
		
		System.out.println("扩充之后长度"+array.length);
		
		int[][] a2=new int[5][2];
		/*a2[4][1]=100;
		
		System.out.println(a2);*/
		
		a2[4]= new int[] {2,5,9};
		a2[1]= new int[] {2,5,9,56};
		
		System.out.println(a2);
		
		
		int[] array3= {1,2,3,4,5,6};
		
		System.out.println(array3);
		
		/*array3[2]=0;
		
		System.out.println(array3);*/
		
		System.arraycopy(array3, 2, array3, 1, 4);
		
		System.out.println(array3);
		
		
		
	}

}

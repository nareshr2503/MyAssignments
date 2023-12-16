package week1.day2;

import java.util.Arrays;

public class FindMissingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,4,3,2,8,6,7}; 
		Arrays.sort(a);
		// 123467
		for(int i=1;i<a.length;i++)
			System.out.println(i);
		/*{
			if(a[i-1]!=i)
			{
		System.out.println(i);
		break;
			} */

	}

}


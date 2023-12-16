package week1.day2;

public class Palindrome {
	public static void main(String[] args) {

		int input=121;
		int rev,i;
		rev=input;
		int rem;
		// 121 , rem 1 , i= 1 , input = 12              
		// 2nd  12 , rem 2 , i=12 , input = 4
		// 3rd  1 ,  1 ,  1 ,1 
		for(i=0;input>0;input=input/10)
		{
			rem=input%10;
			i=(i*10)+rem;	
		}
		if(i==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}	
	}
}



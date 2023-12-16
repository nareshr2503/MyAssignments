package week1.day2;

public class Prime {
	
	public static void main(String[] args) {
		int number =17;
		System.out.println(" The given number is :" +number);
		int count= 0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count ++;
			}
		}
			if(count==2)
			{
				System.out.println("number "+  number  + " = is prime number ");
			}
			else
			{
				System.out.println("number "+  number  + " = is not prime number ");
			}

		}
	}


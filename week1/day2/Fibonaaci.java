package week1.day2;

public class Fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		int count=8;
		System.out.println(n1+" "+n2);
		for(int i=2;i<count;i++)
		{
			n3=n2+n1;
			System.out.print(" "+n3);    
			 n1=n2;    
			 n2=n3;
			 
		}
		

	}

}



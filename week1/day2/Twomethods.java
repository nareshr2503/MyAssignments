package week1.day2;

public class Twomethods {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched succesfully");
		return browserName;
		
	}
	public void loadUrl()
	{
	System.out.println("Application Url loaded successfully");
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Twomethods obj = new Twomethods();
		 System.out.println(obj.launchBrowser("chrome browser"));
		 obj.loadUrl();
		 
	}

}

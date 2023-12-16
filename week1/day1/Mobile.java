package week1.day1;

public class Mobile {
	
  String makeCall(String mobileModel ,float mobileWeight)
 {
	 System.out.println("The mobileModel is" );
	 return mobileModel+" "+mobileWeight;
 }
 
  public void sendMsg(boolean isFullCharged ,int mobileCost)
 {
	 System.out.println("Is FullCharged: "+ isFullCharged+"  "+"Mobilecost: "+ mobileCost);
	
 }
 public static void main(String[] args) {
	Mobile mb= new Mobile();
	System.out.println(" This is my mobile");
	System.out.println(mb.makeCall("Samsung", 280.5f));
	mb.sendMsg( false, 10000);
			
}
}

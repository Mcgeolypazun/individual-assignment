package kiosk.beer;
import kiosk.*;

public class Alcohol extends OrderFood{

	@Override
	public void foodName() {
		System.out.println("Beer");
		
	}

	@Override
	public void foodExplanation() {
		
		System.out.println("설명 없음");
	}

	@Override
	public void OrderPrice() {
		// TODO Auto-generated method stub
		
	}
	
}

package kiosk.beer;
import kiosk.*;

public class Alcohol extends OrderFood{

	@Override
	public void foodName() {
		System.out.println("Alcohol");
		
	}

	@Override
	public void foodExplanation() {
		
		System.out.println("프리미엄 술 종류");
	}

	@Override
	public void OrderPrice() {
		// TODO Auto-generated method stub
		
	}
	
}

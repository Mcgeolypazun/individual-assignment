package kiosk.beer;
import kiosk.*;

public class Alcohol extends OrderFood{//클래스를 추가할때 explanation, name, price를 바꾼다

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

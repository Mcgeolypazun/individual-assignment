package kiosk.Drink;
import kiosk.*;

public class Drinks extends OrderFood{//클래스를 추가할때 explanation, name, price를 바꾼다
	OrderFood orderfood;
	@Override
	public void foodName() {
		System.out.println("Drinks");
		
	}

	@Override
	public void foodExplanation() {
		System.out.println("매장에서 직접 만드는 음료수");
		
	}

	@Override
	public void OrderPrice() {
		// TODO Auto-generated method stub
		
	}

}

package kiosk.custard;
import kiosk.OrderFood;

public class Custard extends OrderFood{//클래스를 추가할때 explanation, name, price를 바꾼다
	OrderFood orderfood;
	@Override
	public void foodName() {
		System.out.println("Frozen Custard");
		
	}

	@Override
	public void foodExplanation() {
		System.out.println("매일 매장에서 신선하게 직접 만드는 부드럽고 진한 맛의 쫀득한 아이스크림");
		
	}

	@Override
	public void OrderPrice() {
		// TODO Auto-generated method stub
		
	}
		
}

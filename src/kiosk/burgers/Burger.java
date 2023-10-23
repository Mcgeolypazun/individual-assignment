package kiosk.burgers;

import kiosk.OrderFood;

public class Burger extends OrderFood {
	OrderFood orderFood;
	private int doubleOption = 3000;
	@Override
	public void foodName() {
		System.out.println("Burgers");
		
	}

	@Override
	public void foodExplanation() {
		System.out.println("항생제와 호르몬제를 사용하지 않은 100% 앵거스 비프 통살을 다져 만든 패티와 쫄깃한 식감의 포테이토 번을 사용한버거");
		
	}

	@Override
	public void OrderPrice() {
		// TODO Auto-generated method stub
		
	}

	public int getOptionSum() {
		return doubleOption;
	}
	
}

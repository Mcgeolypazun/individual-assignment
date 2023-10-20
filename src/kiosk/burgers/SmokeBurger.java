package kiosk.burgers;

public class SmokeBurger extends Burger {
	protected int price = 8900;
	@Override
	public void foodName() {
		System.out.println("Smoke Burger");
	}

	@Override
	public void foodExplanation() {
		System.out.println("애플 우드 칩으로 훈연한 짭짤한 베이컨, 매콤한 체리 페퍼에 쉡소스가 토핑된 치즈 버거");
	}

	@Override
	public void OrderPrice() {
		System.out.println("W "+price);
	}
	
}

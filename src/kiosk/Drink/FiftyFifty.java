package kiosk.Drink;

public class FiftyFifty extends Drinks{
	protected int price = 3500;
	@Override
	public void foodName() {
		System.out.println("Fifty/Fifty");
	}

	@Override
	public void foodExplanation() {
		System.out.println("레몬에이드와 아이스티의 만남");
	}

	@Override
	public void OrderPrice() {
		System.out.println("W "+price);
	}
	
}

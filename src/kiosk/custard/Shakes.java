package kiosk.custard;

public class Shakes extends Custard{
	protected int price = 6500;
	@Override
	public void foodName() {
		System.out.println("Shakes");
	}

	@Override
	public void foodExplanation() {
		System.out.println("바닐라, 초콜렛, 솔티드 캬라멜, 블랙 & 화이트, 스트로 베리, 피넛버터, 커피");
	}

	@Override
	public void OrderPrice() {
		System.out.println("W "+price);
	}
	
}
package kiosk.custard;

public class ShakeOfWeek extends Custard{
	protected int price = 6500;
	@Override
	public void foodName() {
		System.out.println("Shake of the Week");
	}

	@Override
	public void foodExplanation() {
		System.out.println("특별한 커스타드 플레이버");
	}

	@Override
	public void OrderPrice() {
		System.out.println("W "+price);
	}

}

package kiosk.beer;

public class ShackMeisterAle extends Alcohol{
	private int price = 9800;
	@Override
	public void foodName() {
		System.out.print(" ShakeMeisterAle| ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 쉐이크쉑 버거를 위해 뉴욕 브루클린에서 특별히 양조한 에일 맥주");
	}

	@Override
	public void OrderPrice() {
		System.out.print("W "+price);
	}

	public int getPrice(){
		return price;
	}

}

package kiosk.beer;

public class Wine extends Alcohol{
	private int price = 7800;
	@Override
	public void foodName() {
		System.out.print(" Wine| ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 라파쥬 와이너리에서 쉐이크쉑 메뉴를 위해 특별히 생산한 쉑 와인");
	}

	@Override
	public void OrderPrice() {
		System.out.print("W "+price);
	}

	public int getPrice(){
		return price;
	}
}

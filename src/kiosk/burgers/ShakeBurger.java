package kiosk.burgers;

public class ShakeBurger extends Burger{
	protected int price = 6900;
	@Override
	public void foodName() {
		System.out.print(" ShankeBurger| ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
	}

	@Override
	public void OrderPrice() {
		System.out.print("W "+price);
	}

	public int getPrice(){
		return price;
	}
}

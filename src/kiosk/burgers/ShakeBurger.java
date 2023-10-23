package kiosk.burgers;

public class ShakeBurger extends Burger{
	protected int price = 6900;
	private int dishesCount = 1;
	private String nameOfFood = "ShakeBurger";
	private int priceDouble = 9900;
	@Override
	public void foodName() {
		System.out.print(" ShankeBurger ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
	}

	@Override
	public void OrderPrice() {
		System.out.print("| W "+price+" |");
	}

	public int getPrice(){
		return price;
	}

	public int getPriceDouble() {return priceDouble;}

	public int getDishesCount() {
		return this.dishesCount;
	}

	public void setDishesCount() {
		this.dishesCount++;
	}

	public String getName(){ return nameOfFood;}
}

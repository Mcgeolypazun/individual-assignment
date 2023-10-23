package kiosk.burgers;

public class SmokeBurger extends Burger {
	protected int price = 8900;
	private int dishesCount = 1;
	private int priceDouble = 9900;
	private String nameOfFood = "SmokeBurger";
	@Override
	public void foodName() {
		System.out.print(" Smoke Burger ");
	}

	@Override
	public void foodExplanation() {
		System.out.println(" 애플 우드 칩으로 훈연한 짭짤한 베이컨, 매콤한 체리 페퍼에 쉡소스가 토핑된 치즈 버거");
	}

	@Override
	public void OrderPrice() {
		System.out.print("| W "+price+" |");
	}

	public int getPrice(){
		return price;
	}
	public int getPriceDouble() {return priceDouble;}
	public void setPrice(int doubleOption){this.price += doubleOption;}
	public int getDishesCount() {
		return this.dishesCount;
	}

	public void setDishesCount() {
		this.dishesCount++;
	}

	public String getName(){ return nameOfFood;}
}

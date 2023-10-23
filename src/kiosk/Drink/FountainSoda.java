package kiosk.Drink;

public class FountainSoda extends Drinks{
	protected int price = 2700;
	private int dishesCount = 1;
	private String nameOfFood = "FountainSoda";
	@Override
	public void foodName() {
		System.out.print(" FountainSoda ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
	}

	@Override
	public void OrderPrice() {
		System.out.print("| W "+price+" |");
	}

	public int getPrice(){
		return price;
	}

	public int getDishesCount() {
		return this.dishesCount;
	}

	public void setDishesCount(int dishesCount) {
		this.dishesCount = dishesCount;
	}
	public void setDishesCountinit(){ this.dishesCount = 0;}

	public String getName(){ return nameOfFood;}
}

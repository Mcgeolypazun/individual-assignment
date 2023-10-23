package kiosk.Drink;

public class FiftyFifty extends Drinks{
	protected int price = 3500;
	private int dishesCount = 1;
	private String nameOfFood = "FiftyFifty";
	@Override
	public void foodName() {
		System.out.print(" Fifty/Fifty ");
	}

	@Override
	public void foodExplanation() {
		System.out.println(" 레몬에이드와 아이스티의 만남");
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

	public void setDishesCount() {
		this.dishesCount++;
	}

	public String getName(){ return nameOfFood;}
}

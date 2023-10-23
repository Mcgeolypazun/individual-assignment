package kiosk.custard;

public class ShakeOfWeek extends Custard{
	protected int price = 6500;
	private int dishesCount = 1;
	private String nameOfFood = "ShakeOfWeek";
	@Override
	public void foodName() {
		System.out.print(" Shake of the Week ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 특별한 커스타드 플레이버");
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

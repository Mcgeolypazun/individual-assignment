package kiosk.custard;

public class Shakes extends Custard{
	protected int price = 6500;
	private int dishesCount = 1;
	private String nameOfFood = "Shakes";
	@Override
	public void foodName() {
		System.out.print(" Shakes ");
	}

	@Override
	public void foodExplanation() {
		System.out.println("| 바닐라, 초콜렛, 솔티드 캬라멜, 블랙 & 화이트, 스트로 베리, 피넛버터, 커피");
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

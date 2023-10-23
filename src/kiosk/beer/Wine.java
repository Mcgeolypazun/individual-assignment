package kiosk.beer;

public class Wine extends Alcohol{
	private int price = 7800;
	private int dishesCount = 1;
	private String nameOfFood = "Wine";
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

	public int getDishesCount() {
		return this.dishesCount;
	}

	public void setDishesCount() {
		this.dishesCount++;
	}

	public String getName(){ return nameOfFood;}

}

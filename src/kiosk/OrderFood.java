package kiosk;

public abstract class OrderFood {
	private int price;
	private String nameOfFood ="good";
	private int dishesCount = 1;

	
	public abstract void foodName();
	public abstract void foodExplanation();
	public abstract void OrderPrice();

	public int getPrice(){
		return price;
	}

	public int getDishesCount() {
		return dishesCount;
	}

	public void setDishesCount() {
		this.dishesCount++;
	}

	public String getName(){ return nameOfFood;}

	public  void setPrice(int option) {
		this.price += option;
	}
}

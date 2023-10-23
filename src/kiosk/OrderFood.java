package kiosk;

public abstract class OrderFood {//클래스를 추가할때 explanation, name, price를 바꾼다
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

	public void setDishesCount(int dishesCount) {
		this.dishesCount++;
	}

	public String getName(){ return nameOfFood;}

	public  void setPrice(int option) {
		this.price += option;
	}

	public void setDishesCountinit() {
		dishesCount = 0;
	}
}

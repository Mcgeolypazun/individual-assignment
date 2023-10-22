package kiosk;

public abstract class OrderFood {
	private int price;
	private String nameOfFood;
	
	public abstract void foodName();
	public abstract void foodExplanation();
	public abstract void OrderPrice();

	public int getPrice(){
		return price;
	}

}

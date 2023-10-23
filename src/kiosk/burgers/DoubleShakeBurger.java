package kiosk.burgers;

import kiosk.OrderFood;

public class DoubleShakeBurger extends OrderFood {
    protected int price = 9900;
    private int dishesCount = 1;
    private String nameOfFood = "DoubleShakeBurger";
    @Override
    public void foodName() {
        System.out.print(" DoubleShankBurger ");
    }

    @Override
    public void foodExplanation() {
        System.out.println(" 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
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

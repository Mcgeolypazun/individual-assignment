package kiosk.burgers;

public class DoubleShroomBurger extends Burger{
    protected int price = 12400;
    private int dishesCount = 1;
    private String nameOfFood = "DoubleShroomBurger";
    @Override
    public void foodName() {
        System.out.print(" DoubleShroomBurger ");
    }

    @Override
    public void foodExplanation() {
        System.out.println("| 몬스터 치즈와 체다치즈로 속을 채운 베지테리안 버거");
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

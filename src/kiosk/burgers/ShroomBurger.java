package kiosk.burgers;

public class ShroomBurger extends Burger{
    protected int price = 9400;
    private int dishesCount = 1;
    private String nameOfFood = "ShroomBurger";
    @Override
    public void foodName() {
        System.out.print(" ShroomBurger ");
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

    public void setDishesCount(int dishesCount) {
        this.dishesCount = dishesCount;
    }
    public void setDishesCountinit(){ this.dishesCount = 0;}

    public String getName(){ return nameOfFood;}
}

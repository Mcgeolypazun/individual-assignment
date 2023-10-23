package kiosk.custard;

public class RedBeanShake extends Custard{
    protected int price = 6100;
    private int dishesCount = 1;
    private String nameOfFood = "RedBeanShake";
    @Override
    public void foodName() {
        System.out.print(" Red Bean Shake ");
    }

    @Override
    public void foodExplanation() {
        System.out.println("| 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
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

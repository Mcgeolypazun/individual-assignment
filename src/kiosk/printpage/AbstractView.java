package kiosk.printpage;

import kiosk.OrderFood;

public class AbstractView {
    public void setContentView(OrderFood orderFood){
        orderFood.foodName();
        orderFood.OrderPrice();
        orderFood.foodExplanation();
        System.out.println();
    };

    public void dishesMenu(){
        System.out.println("\"SHAKESHAKE BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
    }
}

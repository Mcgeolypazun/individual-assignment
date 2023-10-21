package kiosk.printpage;

import kiosk.OrderFood;

public class AbstractView {
    public void setContentView(OrderFood orderFood){
        orderFood.foodName();
        orderFood.foodExplanation();
        orderFood.OrderPrice();
        System.out.println();
    };
}

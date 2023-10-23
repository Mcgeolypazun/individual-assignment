package kiosk.printpage;

import kiosk.OrderFood;

import java.util.Scanner;

public class PurchaseView extends AbstractView{
    BasketView basketView;
    Scanner kb = new Scanner(System.in);
    public PurchaseView(OrderFood orderFood){
        setContentView(orderFood);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int intButton = kb.nextInt();
        move(intButton,orderFood);

    }

    public PurchaseView(OrderFood orderFood,int option){

        setContentView(orderFood);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int intButton = kb.nextInt();
        move(intButton,orderFood);
    }

    public void move(int intButton,OrderFood orderFood){
        if (intButton == 1){
            orderFood.foodName();
            System.out.println(" 가 장바구니에 추가되었습니다.");
            System.out.println();
            BasketView.basket.add(orderFood);
        }
        else if(intButton == 2){
            System.out.println("진행하던 주문이 취소되었습니다.");
            System.out.println();
        }
    }


}

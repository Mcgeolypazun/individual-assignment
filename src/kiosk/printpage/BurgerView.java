package kiosk.printpage;

import kiosk.Button;
import kiosk.beer.Alcohol;
import kiosk.beer.ShackMeisterAle;
import kiosk.beer.Wine;
import kiosk.burgers.*;

import java.util.Scanner;

public class BurgerView extends AbstractView{
    Scanner kb= new Scanner(System.in);
    ShakeBurger shakeBurger = new ShakeBurger();
    SmokeBurger smokeBurger = new SmokeBurger();
    public BurgerView() throws InterruptedException {
        dishesMenu();
        setContentView(new Burger());
        System.out.print("1.");
        setContentView(shakeBurger);
        System.out.print("2.");
        setContentView(smokeBurger);
        int ButtonInt = kb.nextInt();
        System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");
        System.out.println("1.single(+0)     2.Double(+3000)");
        int ButtonOption = kb.nextInt();
        if (ButtonOption == 2){
            move(ButtonInt,ButtonOption+10);
        }
        else if(ButtonOption == 1){
            move(ButtonInt, ButtonOption);
        }
    }

    public void move(int ButtonInt,int ButtonOption) throws InterruptedException {
        if (ButtonInt == 1 && ButtonOption == 1){
            Button ShakeBurger = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {

                    PurchaseView purchaseView = new PurchaseView(new ShakeBurger());
                }
            };
        }
        else if(ButtonInt == 2 && ButtonOption == 1){
            Button SmokeBurger = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new SmokeBurger());
                }
            };
        }
        else if(ButtonInt == 1 && ButtonOption == 12){
            Button SmokeBurger = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new DoubleShakeBurger());
                }
            };
        }
        else if(ButtonInt == 2 && ButtonOption == 12){
            Button SmokeBurger = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new DoubleSmokeBurger());
                }
            };
        }
    }

}

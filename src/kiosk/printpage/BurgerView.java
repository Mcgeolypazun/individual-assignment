package kiosk.printpage;

import kiosk.Button;
import kiosk.beer.Alcohol;
import kiosk.beer.ShackMeisterAle;
import kiosk.beer.Wine;
import kiosk.burgers.Burger;
import kiosk.burgers.ShakeBurger;
import kiosk.burgers.SmokeBurger;

import java.util.Scanner;

public class BurgerView extends AbstractView{
    Scanner kb= new Scanner(System.in);
    public BurgerView() throws InterruptedException {
        dishesMenu();
        setContentView(new Burger());
        System.out.print("1.");
        setContentView(new ShakeBurger());
        System.out.print("2.");
        setContentView(new SmokeBurger());
        int ButtonInt = kb.nextInt();
        move(ButtonInt);
    }

    public void move(int ButtonInt) throws InterruptedException {
        if (ButtonInt == 1){
            Button ShakeBurger = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new ShakeBurger());
                }
            };
        }
        else if(ButtonInt == 2){
            Button SmokeBurger = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new ShakeBurger());
                }
            };
        }
    }

}

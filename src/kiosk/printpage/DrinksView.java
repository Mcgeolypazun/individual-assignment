package kiosk.printpage;

import kiosk.Button;
import kiosk.Drink.Drinks;
import kiosk.Drink.FiftyFifty;
import kiosk.Drink.FountainSoda;
import kiosk.custard.Custard;
import kiosk.custard.ShakeOfWeek;
import kiosk.custard.Shakes;

import java.util.Scanner;

public class DrinksView extends AbstractView{
    Scanner kb= new Scanner(System.in);
    public DrinksView() throws InterruptedException {
        dishesMenu();
        setContentView(new Drinks());
        System.out.print("1.");
        setContentView(new FiftyFifty());
        System.out.print("2.");
        setContentView(new FountainSoda());
        int ButtonInt = kb.nextInt();
        move(ButtonInt);
    }

    public void move(int ButtonInt) throws InterruptedException {
        if (ButtonInt == 1){
            Button button1 = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new FiftyFifty());
                }
            };
        }
        else if(ButtonInt == 2){
            Button button2 = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new FountainSoda());
                }
            };
        }
    }
}

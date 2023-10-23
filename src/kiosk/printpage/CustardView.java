package kiosk.printpage;

import kiosk.Button;
import kiosk.burgers.Burger;
import kiosk.burgers.ShakeBurger;
import kiosk.burgers.SmokeBurger;
import kiosk.custard.Custard;
import kiosk.custard.RedBeanShake;
import kiosk.custard.ShakeOfWeek;
import kiosk.custard.Shakes;
import static kiosk.Main.kb;


public class CustardView extends AbstractView{

    public CustardView() throws InterruptedException {
        dishesMenu();
        setContentView(new Custard());
        System.out.print("1.");
        setContentView(new ShakeOfWeek());
        System.out.print("2.");
        setContentView(new Shakes());
        System.out.print("3.");
        setContentView(new RedBeanShake());
        int ButtonInt = kb.nextInt();
        move(ButtonInt);
    }

    public void move(int ButtonInt) throws InterruptedException {
        if (ButtonInt == 1){
            Button button1 = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new ShakeOfWeek());
                }
            };
        }
        else if(ButtonInt == 2){
            Button button2 = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new Shakes());
                }
            };
        }
        else if(ButtonInt == 3){
            Button button2 = new Button(ButtonInt) {
                @Override
                public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new RedBeanShake());
                }
            };
        }
    }
}

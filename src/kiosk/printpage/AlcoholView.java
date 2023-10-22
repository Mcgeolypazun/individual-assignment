package kiosk.printpage;

import kiosk.Button;
import kiosk.OrderFood;
import kiosk.beer.Alcohol;
import kiosk.beer.ShackMeisterAle;
import kiosk.beer.Wine;

import java.util.Scanner;

public class AlcoholView extends AbstractView{

    Scanner kb= new Scanner(System.in);
   public AlcoholView() throws InterruptedException {
       dishesMenu();
       setContentView(new Alcohol());
       System.out.print("1.");
       setContentView(new ShackMeisterAle());
       System.out.print("2.");
       setContentView(new Wine());
       int ButtonInt = kb.nextInt();
       move(ButtonInt);
   }

   public void move(int ButtonInt) throws InterruptedException {
       if (ButtonInt == 1){
           Button shackMeisterAlebutton = new Button(ButtonInt) {
               @Override
               public void Move(int buttonInt) {
                   PurchaseView purchaseView = new PurchaseView(new ShackMeisterAle());
               }
           };
       }
       else if(ButtonInt == 2){
           Button wineButton = new Button(ButtonInt) {
               @Override
               public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView(new Wine());
               }
           };
       }
   }


}

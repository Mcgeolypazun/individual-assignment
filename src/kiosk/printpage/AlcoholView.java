package kiosk.printpage;

import kiosk.Button;
import kiosk.OrderFood;
import kiosk.beer.Alcohol;
import kiosk.beer.ShackMeisterAle;
import kiosk.beer.Wine;

import java.util.Scanner;

public class AlcoholView extends AbstractView{

    Scanner kb= new Scanner(System.in);
   public AlcoholView(){
       setContentView(new Alcohol());
       setContentView(new ShackMeisterAle());
       setContentView(new Wine());
       int ButtonInt = kb.nextInt();
       move(ButtonInt);
   }

   public void move(int ButtonInt){
       if (ButtonInt == 1){
           Button shackMeisterAle = new Button(ButtonInt) {
               @Override
               public void Move(int buttonInt) {
                   PurchaseView purchaseView = new PurchaseView();
               }
           };
       }
       else if(ButtonInt == 2){
           Button wine = new Button(ButtonInt) {
               @Override
               public void Move(int buttonInt) {
                    PurchaseView purchaseView = new PurchaseView();
               }
           };
       }
   }


}

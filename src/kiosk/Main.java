package kiosk;
import java.util.*;

import kiosk.Drink.Drinks;
import kiosk.Drink.FiftyFifty;
import kiosk.Drink.FountainSoda;
import kiosk.beer.Alcohol;
import kiosk.beer.ShackMeisterAle;
import kiosk.beer.Wine;
import kiosk.burgers.*;
import kiosk.custard.*;
import kiosk.printpage.AbstractView;
import kiosk.printpage.MainView;

public class Main {//0번 숨겨진 기능 추가
	public static boolean flag = true;
	public static void main(String[] args) throws InterruptedException {

		Scanner kb = new Scanner(System.in);



		while (flag){
			AbstractView abstractView = new MainView();
			int buttonInt = kb.nextInt();
			AbstractView mainView = new MainView(buttonInt);

		}

	}

}

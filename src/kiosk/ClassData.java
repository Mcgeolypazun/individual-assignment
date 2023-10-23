package kiosk;

import kiosk.Drink.Drinks;
import kiosk.Drink.FiftyFifty;
import kiosk.Drink.FountainSoda;
import kiosk.beer.ShackMeisterAle;
import kiosk.beer.Wine;
import kiosk.burgers.DoubleShakeBurger;
import kiosk.burgers.DoubleSmokeBurger;
import kiosk.burgers.ShakeBurger;
import kiosk.burgers.SmokeBurger;
import kiosk.custard.Custard;
import kiosk.custard.ShakeOfWeek;
import kiosk.custard.Shakes;

import java.util.*;

public class ClassData {

    public static HashMap<String,OrderFood> mapStringClass = new HashMap<>();


    public static void data(){
        ShackMeisterAle shackMeisterAle= new ShackMeisterAle();
        Wine wine= new Wine();
        DoubleSmokeBurger doubleSmokeBurger= new DoubleSmokeBurger();
        DoubleShakeBurger doubleShakeBurger= new DoubleShakeBurger();
        ShakeBurger shakeBurger = new ShakeBurger();
        SmokeBurger smokeBurger = new SmokeBurger();
        Custard custard = new Custard();
        ShakeOfWeek shakeOfWeek = new ShakeOfWeek();
        Shakes shakes = new Shakes();
        FiftyFifty fiftyFifty = new FiftyFifty();
        FountainSoda fountainSoda = new FountainSoda();
        mapStringClass.put(shackMeisterAle.getName(), shackMeisterAle);
        mapStringClass.put(wine.getName(), wine);
        mapStringClass.put(doubleShakeBurger.getName(), doubleShakeBurger);
        mapStringClass.put(doubleSmokeBurger.getName(), doubleSmokeBurger);
        mapStringClass.put(shakeOfWeek.getName(),shakeOfWeek);
        mapStringClass.put(shakes.getName(),shakes);
        mapStringClass.put(fiftyFifty.getName(),fiftyFifty);
        mapStringClass.put(fountainSoda.getName(),fountainSoda);


    }

}

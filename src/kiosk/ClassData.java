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

    public static HashMap<String,Integer> mapStringClass = new HashMap<>();

    public ClassData(){
        data();
    }

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
        mapStringClass.put(shackMeisterAle.getName(), shackMeisterAle.getPrice());
        mapStringClass.put(wine.getName(), wine.getPrice());
        mapStringClass.put(doubleShakeBurger.getName(), doubleShakeBurger.getPrice());
        mapStringClass.put(doubleSmokeBurger.getName(), doubleSmokeBurger.getPrice());
        mapStringClass.put(shakeOfWeek.getName(),shakeOfWeek.getPrice());
        mapStringClass.put(shakes.getName(),shakes.getPrice());
        mapStringClass.put(fiftyFifty.getName(),fiftyFifty.getPrice());
        mapStringClass.put(fountainSoda.getName(),fountainSoda.getPrice());
        mapStringClass.put(shakeBurger.getName(),shakeBurger.getPrice());
        mapStringClass.put(smokeBurger.getName(), smokeBurger.getPrice());



    }

}

package kiosk.printpage;

import kiosk.Button;
import kiosk.Drink.Drinks;
import kiosk.Main;
import kiosk.OrderFood;
import kiosk.beer.Alcohol;
import kiosk.burgers.Burger;
import kiosk.custard.Custard;

import static kiosk.printpage.BasketView.checkView;

public class MainView extends AbstractView{
    private int buttonInt;

//Main에서 직접 구현 하지 않고 MainView 클래스에서 구현한다.
    public MainView(int buttonInt) throws InterruptedException {

        this.buttonInt = buttonInt;
        move(buttonInt);

    }

    public void move(int buttonInt) throws InterruptedException {//다른 View로 이동하는 메소드
        switch (buttonInt) {
            case 0:
                Button system = new Button(buttonInt) {
                    @Override
                    public void Move(int buttonInt) throws InterruptedException {
                        SystemView systemView = new SystemView();
                    }
                };
                break;

            case 1:Button burger = new Button(buttonInt) {
                @Override
                public void Move(int buttonInt) throws InterruptedException {
                    BurgerView burgerView = new BurgerView();
                }
            };
            break;
            case 2:Button alcohol = new Button(buttonInt) {
                @Override
                public void Move(int buttonInt) throws InterruptedException {
                    AlcoholView alcoholView = new AlcoholView();
                }

            };
            break;
            case 3:Button custard = new Button(buttonInt) {
                @Override
                public void Move(int buttonInt) throws InterruptedException {
                    CustardView custardView = new CustardView();
                }

            };
            break;
            case 4:Button drinks = new Button(buttonInt) {
                @Override
                public void Move(int buttonInt) throws InterruptedException {
                    DrinksView drinksView = new DrinksView();
                }

            };
            break;
            case 5:Button basket = new Button(buttonInt) {
                @Override
                public void Move(int buttonInt) throws InterruptedException {
                    checkView();

                }

            };
            break;
            case 6:Button cancel = new Button(buttonInt) {
                @Override
                public void Move(int buttonInt) {
                        Main.flag = false;
                }

            };
            break;


        }
    }


    public MainView(){ //메인 메뉴판을 보여주는 생성자
        setContentView(null);
    }

    @Override
    public void setContentView(OrderFood orderFood) {//메인 메뉴판 프린트

        System.out.println("-----------------------");
        System.out.println("\"SHAKESHAKE BURGER에 오신 걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해 주세요.");
        System.out.println();

        System.out.println("[ SHAKESHAKE MENU ]");
        orderFood = new Burger();
        System.out.print("1. ");
        orderFood.foodName();
        orderFood.foodExplanation();
        System.out.println();

        orderFood = new Alcohol();
        System.out.print("2. ");
        orderFood.foodName();
        orderFood.foodExplanation();
        System.out.println();



        orderFood = new Custard();
        System.out.print("3. ");
        orderFood.foodName();
        orderFood.foodExplanation();
        System.out.println();

        orderFood = new Drinks();
        System.out.print("4. ");
        orderFood.foodName();
        orderFood.foodExplanation();
        System.out.println();

        System.out.println("[ ORDER MENU ]");
        System.out.print("5. 장바구니");
        System.out.println();

        System.out.print("6. 프로그램 종료");
        System.out.println();

    }
}

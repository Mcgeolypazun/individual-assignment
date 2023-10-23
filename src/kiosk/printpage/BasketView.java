package kiosk.printpage;

import kiosk.OrderFood;
import java.util.*;

import static kiosk.printpage.SystemView.*;

public class BasketView extends AbstractView{
   static ArrayList<OrderFood> basket = new ArrayList<>();
   static HashMap<String,Integer> mapBasket = new HashMap();
   static int humanCount = 0;
   static Scanner kb = new Scanner(System.in);
   static int sum = 0;

   static public void checkView() throws InterruptedException {
       int number = 1;
       System.out.println("|Orders|");

       for(int i=0;i<basket.size();i++){
           for(int j=i-1;j>=0;j--){
               if (basket.get(i).getName().equals(basket.get(j).getName())){
                   basket.get(i).setDishesCount();//숫자 증가, 디쉬 갯수 세기
                   mapBasket.put(basket.get(i).getName(),basket.get(i).getDishesCount());
               }
           }
            if(i == 0){
                mapBasket.put(basket.get(i).getName(),basket.get(i).getDishesCount());
            }

       }
        for(int i=0;i<basket.size();i++){//화면 출력
            if(mapBasket.get(basket.get(i).getName()) == null){

                    System.out.print((number++)+ ".");
                    basket.get(i).foodName();
                    basket.get(i).OrderPrice();
                    System.out.print("| " + basket.get(i).getDishesCount() + "개");
                    basket.get(i).foodExplanation();

                    System.out.println();
                    sum += basket.get(i).getPrice();

                continue;
            }
            if(mapBasket.get(basket.get(i).getName())>=2) {
                System.out.print((number++)+ ".");
                basket.get(i).foodName();
                basket.get(i).OrderPrice();
                System.out.print("| " + mapBasket.get(basket.get(i).getName()) + "개");
                basket.get(i).foodExplanation();

                System.out.println();
                sum += basket.get(i).getPrice()*mapBasket.get(basket.get(i).getName());
                mapBasket.put(basket.get(i).getName(),0);
            }
            else if(mapBasket.get(basket.get(i).getName()) == 1){
                System.out.print((number++)+ ".");
                basket.get(i).foodName();
                basket.get(i).OrderPrice();
                System.out.print("| " + mapBasket.get(basket.get(i).getName()) + "개");
                basket.get(i).foodExplanation();

                System.out.println();
                sum += basket.get(i).getPrice()*mapBasket.get(basket.get(i).getName());
                mapBasket.put(basket.get(i).getName(),0);
            }

        }

       System.out.println("총액은 "+sum+"W 입니다.");
       System.out.println();
       System.out.println("1.주문    2.메뉴판");
       orderOrMenu(kb.nextInt());

   }

   public static void orderOrMenu(int intButton) throws InterruptedException {
       if(intButton == 1){
           humanCount++;
           SystemView.sum += sum;
           sum = 0;
           allDishesArr.addAll(basket);
           System.out.println("주문이 완료 되었습니다.");
           System.out.println();
           System.out.println("대기번호는 ["+humanCount+"] 번 입니다.");
           System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
           basket.clear();
           mapBasket.clear();
           Thread.sleep(3000);

       }
       else if(intButton == 2){
           System.out.println("진행하던 주문이 취소되었습니다.");
           System.out.println();
       }
   }

}

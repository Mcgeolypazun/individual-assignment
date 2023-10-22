package kiosk.printpage;

import kiosk.OrderFood;
import java.util.*;

public class BasketView extends AbstractView{
   static ArrayList<OrderFood> basket = new ArrayList<>();
   static int humanCount = 0;
   static Scanner kb = new Scanner(System.in);

   static public void checkView() throws InterruptedException {
       int sum = 0;
       System.out.println("|Orders|");

       for(int i=0;i<basket.size();i++){
           System.out.print(i+1+".");
           basket.get(i).foodName();
           basket.get(i).OrderPrice();
           basket.get(i).foodExplanation();

           System.out.println();
           sum += basket.get(i).getPrice();
       }

       System.out.println("총액은 "+sum+"W 입니다.");
       System.out.println();
       System.out.println("1.주문    2.메뉴판");
       orderOrMenu(kb.nextInt());

   }

   public static void orderOrMenu(int intButton) throws InterruptedException {
       if(intButton == 1){
           humanCount++;
           System.out.println("주문이 완료 되었습니다.");
           System.out.println();
           System.out.println("대기번호는 ["+humanCount+"] 번 입니다.");
           System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
           basket.clear();
           Thread.sleep(3000);

       }
       else if(intButton == 2){
           System.out.println("진행하던 주문이 취소되었습니다.");
           System.out.println();
       }
   }

}

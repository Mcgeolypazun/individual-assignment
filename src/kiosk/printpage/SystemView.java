package kiosk.printpage;
import kiosk.ClassData;
import kiosk.OrderFood;

import java.util.*;
import java.util.Scanner;

import static kiosk.ClassData.mapStringClass;
import static kiosk.printpage.BasketView.mapBasket;
import static kiosk.Main.kb;
public class SystemView {
    static int sum = 0;
    static ArrayList<OrderFood> allDishesArr = new ArrayList<>();
    static HashMap<String,Integer> allDishesMap = new HashMap<>();
    SystemView(){
        ClassData classData = new ClassData();
        while(true) {
            System.out.println("| 총 판매금액 현황 |");
            System.out.println("현재까지 총 판매된 금액은 [W " + sum + " ]입니다.");
            System.out.println();

            System.out.println("[ 총 판매상품 목록 현황 ]");
            System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
            System.out.println();

            for(int i=0;i<allDishesArr.size();i++){
                //System.out.println(allDishesArr.get(i).getName()+" | "+"1");
                int valueCount = 1;
               for(int j=i-1;j>=0;j--){
                   if(allDishesArr.get(i).getName().equals(allDishesArr.get(j).getName())){
                       allDishesMap.put(allDishesArr.get(i).getName(),valueCount++);
                   }
                   else {
                       allDishesMap.put(allDishesArr.get(i).getName(),valueCount);
                   }
               }
                if(i == 0){
                    allDishesMap.put(allDishesArr.get(i).getName(),valueCount);
                }
            }

            for (Map.Entry<String,Integer> entry : allDishesMap.entrySet()){
                System.out.print(entry.getKey()+" \t | \t"+entry.getValue());
                System.out.println(" | "+ mapStringClass.get(entry.getKey())+"W");
            }
            System.out.println();
            System.out.println("1. 돌아가기");
            int back = kb.nextInt();
            if (back == 1) {//1을 누르면 메인 뷰로 돌아감
                break;
            }
        }

    }
}

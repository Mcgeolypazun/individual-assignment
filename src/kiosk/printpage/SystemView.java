package kiosk.printpage;

import java.util.Scanner;

public class SystemView {
    static int sum = 0;
    Scanner kb = new Scanner(System.in);
    SystemView(){
        while(true) {
            System.out.println("| 총 판매금액 현황 |");
            System.out.println("현재까지 총 판매된 금액은 [W " + sum + " ]입니다.");

            System.out.println("1. 돌아가기");
            int back = kb.nextInt();
            if (back == 1) {
                break;
            }
        }

    }
}

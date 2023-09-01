package question;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Money = sc.nextInt();

        if(Money>10000){
            Money%=10000;
            System.out.println("10000 원짜리 = " + 10000/Money);
        }
        if(Money>1000){
            Money%=1000;
            System.out.println("10000 원짜리 = " +1000/Money);
        }
        if(Money>100){
            Money%=100;
            System.out.println("10000 원짜리 = " + 100/Money);
        }
        if(Money>10){
            Money%=10;
            System.out.println("10000 원짜리 = " +10/Money);
        }
        if(Money>1){
            Money%=1;
            System.out.println("10000 원짜리 = " +1/Money);
        }
        System.out.println("Money = " + Money);
    }
}

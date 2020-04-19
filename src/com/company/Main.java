package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        while (true){
            int x = scan.nextInt();
            if (x==0){
                break;
            }
            if (x%2==0){
                sum1 += x;
            }
            else {
                sum2 += x;
            }
        }
        System.out.printf("%d %d",sum1,sum2);
    }
}

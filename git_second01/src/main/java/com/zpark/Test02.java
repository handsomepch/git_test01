package com.zpark;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入您的银行卡号");
        Scanner sc = new Scanner(System.in);
        String carID = sc.next();

        System.out.println("请输入您的姓名：");
        String name = sc.next();
    }
}

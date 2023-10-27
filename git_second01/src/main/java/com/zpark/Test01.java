package com.zpark;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入你的名字");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

    }
}

package com.example.lib;

public class MyClass {public static void main(String[]args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("年");
    int year = sc.nextInt();
    System.out.println("月");
    int month = sc.nextInt();
    System.out.println("日");
    int day = sc.nextInt();
    System.out.println(year+"/"+month+"/"+day);
}
}

package com.javase.method;

import java.util.Scanner;

/**
 * 
 * 2023-04-4-5:56
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(1==1){
            System.out.println("---简易计算器功能---");
            System.out.println("****1.加法*********");
            System.out.println("****2.减法*********");
            System.out.println("****3.乘法*********");
            System.out.println("****4.除法*********");
            System.out.println("****5.退出计算*********");
            System.out.println("请选择：");
            int i = scan.nextInt();
            switch (i){
                case 1:
                    System.out.println("输入两个数，以空格分割：");
                    int add = add(scan.nextInt(), scan.nextInt());
                    System.out.println(add);
                    break;

                case 2:
                    System.out.println("输入两个数，以空格分割：");
                    int sub = sub(scan.nextInt(), scan.nextInt());
                    System.out.println(sub);
                    break;
                case 3:
                    System.out.println("输入两个数，以空格分割：");
                    int mul = mul(scan.nextInt(), scan.nextInt());
                    System.out.println(mul);
                    break;
                case 4:
                    System.out.println("输入两个数，以空格分割：");
                    float div = div(scan.nextInt(), scan.nextInt());
                    System.out.println(div);
                    break;
                case 5:
                    exit();
            }
        }

    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static float div(int a,int b){
        if(b==0){
            System.out.println("输入有误，不能为0");
            return 0;
        }else{
            return a/b;
        }
    }
    public static void exit(){
        System.exit(0);
    }
}

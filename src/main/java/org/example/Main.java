package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        teste();
//        ex1();
//        ex2();
//        ex3();
//        ex4();
        ex5();
    }
    public static void teste(){
            String product1 = "Computer";
            String product2 = "Officer Desk";
            int age = 30;
            int code = 5290;
            char gender = 'F';
            double price1 = 2100.0;
            double price2 = 650.5;
            double measure = 53.234567;

    System.out.printf("Products: %n%s, which price is $%.2f%n%s, which price is $%.2f%n%nRecord:%d years old, code %d, and gender: %c%n%nMeasure with eight decimal places: %f%nRounded (three decimal places): %.3f%n ",product1, price1, product2, price2, age, code, gender, measure, measure);
        }

    public static void ex1(){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.printf("SOMA: %d",soma);
    }

    public static void ex2(){
        Scanner sc = new Scanner(System.in);

        float raio = sc.nextFloat();
        float pi = 3.14159F;
        float areaCalc = raio * pi;

        System.out.printf("Area do circulo com raio de %.4f: %.4f",raio,areaCalc);
    }

    public static void ex3(){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int p1 = n1 * n2;
        int p2 = n3 * n4;

        int r = p1 - p2;

        System.out.println(r);
    }

    public static void ex4(){
        Scanner sc = new Scanner(System.in);

        int WorkerID = sc.nextInt();
        float Salary = sc.nextFloat();
        float WorkedHours = sc.nextFloat();

        System.out.printf("ID do trabalhador: %d%n",WorkerID);
        System.out.print(Salary * WorkedHours);
    }

    public static void ex5(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int clothesID = rd.nextInt(26);

        int clothesQnt = rd.nextInt(6);

        float clothesPrice = rd.nextFloat(11);

        float clothesTotalPrice = clothesPrice * clothesQnt;

//        System.out.println(clothesID);
//        System.out.println(clothesQnt);
//        System.out.println(clothesPrice);
//        System.out.println(clothesTotalPrice);
        System.out.printf("price to buy it: %.2f",clothesTotalPrice);
    }
    }
package com.company;

import com.company.calculate;

import java.util.Scanner;

public  class Triangle implements calculate {
    public void Triangle (){

    }

    public void getArea() {
        System.out.print("Base = ");
        Scanner scanner = new Scanner(System.in);
        float base = scanner.nextInt();
        System.out.print("Altura = ");
        float height = scanner.nextInt();

        float area = base * height /2;
        System.out.println("El area del triángulo es: " + area);
    }

    public void getPerimeter() {
        System.out.print("Lado 1 = ");
        Scanner scanner = new Scanner(System.in);
        float side_1 = scanner.nextInt();
        System.out.print("Lado 2 = ");
        float side_2 = scanner.nextInt();
        System.out.print("Lado 3 = ");
        float side_3 = scanner.nextInt();

        float perimeter = side_1 + side_2 + side_3;
        System.out.println("El perímetro del triángulo es: " + perimeter);
    }
}

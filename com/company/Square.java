package com.company;

import com.company.calculate;

import java.util.Scanner;

public  class Square implements calculate {
    public void Square (){

    }

    public void getArea() {
        System.out.print("Lado = ");
        Scanner scanner = new Scanner(System.in);
        float side = scanner.nextInt();

        float area = side * side;
        System.out.println("El área del cuadrado es: " + area);
    }

    public void getPerimeter() {
        System.out.print("Lado = ");
        Scanner scanner = new Scanner(System.in);
        float side = scanner.nextInt();

        float perimeter = side * 4;
        System.out.println("El perímetro del cuadrado es: " + perimeter);
    }
}
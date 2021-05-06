package com.company;

import com.company.calculate;

import java.util.Scanner;

public  class Circle implements calculate {
    public void Circle (){

    }

    public void getArea() {
        System.out.print("Radio = ");
        Scanner scanner = new Scanner(System.in);
        float radius  = scanner.nextInt();

        float area = (float) (Math.PI * (radius * radius));
        System.out.println("El area del círculo es: " + area);
    }

    public void getPerimeter() {
        System.out.print("Radio = ");
        Scanner scanner = new Scanner(System.in);
        float radius  = scanner.nextInt();

        float perimeter = (radius * 2);
        System.out.println("El perímetro del círculo es: " + perimeter);
    }
}

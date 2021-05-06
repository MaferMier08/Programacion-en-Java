package com.company;
import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;

public class Shape {


    public static void main(String[] args) {
        Square Square = new Square();
        Triangle Triangle = new Triangle();
        Circle Circle = new Circle();

        Scanner scanner = new Scanner(System.in);
        int math =0;
        do {
            System.out.println("Qué desea calcular?");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.println("0. Salir");
            math  = scanner.nextInt();
            switch (math)
            {
                case 0: System.out.println("Adios!!");
                    break;
                case 1: case 2:
                    break;
                default: System.out.println("Opción no válida");
                    break;
            }
        } while (math != 0 & math != 1 & math != 2);
        int shape =0;
        if (math == 0){

        }else {
            do {
                System.out.println("Qué figura?");
                System.out.println("1. Circulo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triangulo");
                shape = scanner.nextInt();
                switch (shape) {
                    case 0:
                        System.out.println("Adios!!");
                        break;
                    case 1:
                        if (math == 1) {
                            Circle.getArea();
                        } else {
                            Circle.getPerimeter();
                        }
                        break;
                    case 2:
                        if (math == 1) {
                            Square.getArea();
                        } else {
                            Square.getPerimeter();
                        }
                        break;
                    case 3:
                        if (math == 1) {
                            Triangle.getArea();
                        } else {
                            Triangle.getPerimeter();
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } while (shape != 0 & shape != 1 & shape != 2 & shape != 3);
        }


    }


}

package ru.fanvan.squares;

import ru.fanvan.squares.entity.Circle;
import ru.fanvan.squares.entity.Rectangle;
import ru.fanvan.squares.entity.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("[ > ] Выберите фигуру: 1 -- круг, 2 -- прямоугольник, 3 -- треугольник");
        int figure = in.nextInt();

        switch (figure) {
            case 1: {
                System.out.println("[ > ] Введите радиус");
                float R = in.nextFloat();

                Circle circle = new Circle(R);
                System.out.println("[ * ] Площадь круга: " + circle.getSquare());
                break;
            }
            case 2: {
                System.out.println("[ > ] Введите ширину и высоту");
                float W = in.nextFloat();
                float H = in.nextFloat();

                Rectangle rectangle = new Rectangle(W, H);
                System.out.println("[ * ] Площадь прямоугольника: " + rectangle.getSquare());
                break;
            }
            case 3: {
                System.out.println("[ > ] Введите три стороны");
                float O = in.nextFloat();
                float TW = in.nextFloat();
                float TH = in.nextFloat();

                Triangle triangle = new Triangle(O, TW, TH);
                System.out.println("[ * ] Площадь треугольника: " + triangle.getSquare());
                break;
            }
        }
    }
}

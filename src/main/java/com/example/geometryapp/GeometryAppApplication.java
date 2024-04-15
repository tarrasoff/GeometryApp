package com.example.geometryapp;

import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Triangle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.example.utils.GeometryUtils.compareAreas;
import static org.example.utils.GeometryUtils.comparePerimeters;

@SpringBootApplication
public class GeometryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeometryAppApplication.class, args);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        boolean circleAndRectangleAreasEqual = compareAreas(circle.getArea(), rectangle.getArea());
        boolean circleAndTriangleAreasEqual = compareAreas(circle.getArea(), triangle.getArea());
        boolean rectangleAndTriangleAreasEqual = compareAreas(rectangle.getArea(), triangle.getArea());

        System.out.println("\nComparing areas:");
        System.out.println("Circle and Rectangle: " + circleAndRectangleAreasEqual);
        System.out.println("Circle and Triangle: " + circleAndTriangleAreasEqual);
        System.out.println("Rectangle and Triangle: " + rectangleAndTriangleAreasEqual);

        boolean circleAndRectanglePerimetersEqual = comparePerimeters(circle.getPerimeter(), rectangle.getPerimeter());
        boolean circleAndTrianglePerimetersEqual = comparePerimeters(circle.getPerimeter(), triangle.getPerimeter());
        boolean rectangleAndTrianglePerimetersEqual = comparePerimeters(rectangle.getPerimeter(), triangle.getPerimeter());

        System.out.println("\nComparing perimeters:");
        System.out.println("Circle and Rectangle: " + circleAndRectanglePerimetersEqual);
        System.out.println("Circle and Triangle: " + circleAndTrianglePerimetersEqual);
        System.out.println("Rectangle and Triangle: " + rectangleAndTrianglePerimetersEqual);
    }
}
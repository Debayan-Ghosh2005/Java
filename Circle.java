class CircleShape {
    double radius;

    CircleShape() {
        radius = 1.0;
    }

    CircleShape(double r) {
        radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        CircleShape circle1 = new CircleShape(2.0);
        CircleShape circle2 = new CircleShape(12);
        CircleShape circle3 = new CircleShape(24);

        System.out.println("Circle 1 - Radius: " + circle1.radius + ", Area: " + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.radius + ", Area: " + circle2.getArea());
        System.out.println("Circle 3 - Radius: " + circle3.radius + ", Area: " + circle3.getArea());
    }
}

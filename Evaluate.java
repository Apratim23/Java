interface Calculate {
    double diagonal();
    double area();
}

class RightAngled implements Calculate {
    private double base;
    private double height;

    public RightAngled(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double diagonal() {
        return Math.sqrt(base * base + height * height);
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Calculate {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double diagonal() {
        return Math.sqrt(length * length + width * width);
    }

   
    public double area() {
        return length * width;
    }
}

public class Evaluate {
    public static void main(String[] args) {
        double base = 3.0;
        double height = 4.0;
        Calculate rightAngled = new RightAngled(base, height);
        System.out.println("Diagonal of right-angled triangle: " + rightAngled.diagonal());
        System.out.println("Area of right-angled triangle: " + rightAngled.area());

        double length = 5.0;
        double width = 6.0;
        Calculate rectangle = new Rectangle(length, width);
        System.out.println("Diagonal of rectangle: " + rectangle.diagonal());
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}




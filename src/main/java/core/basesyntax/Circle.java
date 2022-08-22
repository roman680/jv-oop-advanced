package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, radius = "
                + radius + ", area = "
                + getArea() + " Color: "
                + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

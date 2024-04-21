package structural.adapter;

public class CircleAdapterWithComposition implements  Shape{

    private Circle circle;

    public CircleAdapterWithComposition(Circle circle){
        this.circle = circle;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(circle.getRadius(),2);
    }
}

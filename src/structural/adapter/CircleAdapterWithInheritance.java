package structural.adapter;

/***
 *  With inheritance It is directly dependent and leads to coupling
 */
public class CircleAdapterWithInheritance extends Circle implements Shape{

    public CircleAdapterWithInheritance(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(),2);
    }
}

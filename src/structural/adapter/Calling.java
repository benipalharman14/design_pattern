package structural.adapter;

public class Calling {

    public static void main(String[] args) {

        Shape shape = new CircleAdapterWithComposition(new Circle(12));

        System.out.println(shape.getArea());
    }
}

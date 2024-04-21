package structural.bridge;

public class Circle implements Shape{
    @Override
    public void draw(DrawingImpl implementor) {
        implementor.drawCircle();
    }
}

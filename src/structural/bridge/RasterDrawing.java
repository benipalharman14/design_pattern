package structural.bridge;

public class RasterDrawing implements DrawingImpl{
    @Override
    public void drawRect() {
        System.out.println("Drawing rectangle using raster graphics");
    }

    @Override
    public void drawCircle() {
        System.out.println("Drawing circle using raster graphics");
    }
}

import java.awt.geom.Rectangle2D;

public abstract class FractalGenerator
{
    public static double getCoord(double rangeMin, double rangeMax, int size, int coord)
    {
        assert size > 0;
        assert coord >= 0 && coord < size;
        double range = rangeMax - rangeMin;
        return rangeMin + (range * (double) coord / (double) size);
    }
    // Устанавливает указанный прямоугольник, чтобы он содержал начальный диапазон, подходящий для генерируемого фрактала.
    public abstract void getInitialRange(Rectangle2D.Double range);
    // Обновляет текущий диапазон для центрирования по указанным координатам и увеличения или уменьшения масштаба
    // с использованием указанного коэффициента масштабирования.
    public void recenterAndZoomRange(Rectangle2D.Double range, double centerX, double centerY, double scale) {
        double newWidth = range.width * scale;
        double newHeight = range.height * scale;
        range.x = centerX - newWidth / 2;
        range.y = centerY - newHeight / 2;
        range.width = newWidth;
        range.height = newHeight;
    }
    // Точка, которая не исчезает до достижения предела итераций, обозначается результатом -1.
    public abstract int numIterations(double x, double y);
}
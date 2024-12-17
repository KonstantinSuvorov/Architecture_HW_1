package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;

/**
 * полигон
 */
public class Poligon {
    public ArrayList<Point3D> points = new ArrayList<Point3D>();

    /**
     * конструктор
     *
     * @param point
     */
    public Poligon(Point3D point) {
        point.add(point);
    }
}


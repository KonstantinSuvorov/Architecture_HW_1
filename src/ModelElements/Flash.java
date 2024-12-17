package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

/**
 * класс источник света
 */
public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public java.awt.Color Color;
    public Float Power;

    /**
     * поворот источника света
     *
     * @param angleAction
     */
    public void rotate(Angle3D angleAction) {
    }

    /**
     * переместить к точке
     *
     * @param pointAction
     */
    public void move(Point3D pointAction) {
    }
}
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public static boolean matching(Point3d p1, Point3d p2) {
        return p1.xCoord == p2.xCoord && p1.yCoord == p2.yCoord && p1.zCoord == p2.zCoord;
    }

    public static double toDistance(Point3d p1, Point3d p2) {
        return round(sqrt(pow(p2.getX() - p1.getX(), 2) + pow(p2.getY() - p1.getY(), 2) + pow(p2.getZ() - p1.getZ(), 2)) * 100.0) / 100.0;
    }
}

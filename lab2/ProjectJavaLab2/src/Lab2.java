import java.util.Scanner;

public class Lab2 {
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        if (Point3d.matching(p1, p2) || Point3d.matching(p2, p3) || Point3d.matching(p3, p1)) {
            return 0;
        }
        double a = Point3d.toDistance(p1, p2);
        double b = Point3d.toDistance(p2, p3);
        double c = Point3d.toDistance(p3, p1);

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите координаты первой точки: ");
        Point3d p1 = new Point3d(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        System.out.print("Введите координаты второй точки: ");
        Point3d p2 = new Point3d(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        System.out.print("Введите координаты третьей точки: ");
        Point3d p3 = new Point3d(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());

        double area = computeArea(p1, p2, p3);

        if (area != 0) {
            System.out.print("Площадь треугольника = ");
            System.out.printf("%2.2f", area);
        } else {
            System.out.println("Точки совпадают, невозможно вычислить площадь");
        }
    }
}
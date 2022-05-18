public class Shape {
    public static void main(String[] arg) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);
        Triangle tri = new Triangle(a, b, c);
        System.out.println("三角形面积：" + tri.getArea());
        System.out.println("三角形周长：" + tri.getFerence());
    }
}
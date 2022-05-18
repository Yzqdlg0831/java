public class Triangle implements InterfaceShape {
    Point a;
    Point b;
    Point c;
    public double s1;
    public double s2;
    public double s3;

    public Triangle(Point A, Point B, Point C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }

    //三角形面积
    public double getArea() {
        double p = (this.getS1() + this.getS2() + this.getS3()) / 2;
        return Math.pow(p * (p - this.getS1()) * (p - this.getS2()) * (p - this.getS3()), 0.5);
    }

    //三角形周长
    public double getFerence() {
        return this.getS1() + this.getS2() + this.getS3();
    }

    public double getS1() {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public double getS2() {
        return Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
    }

    public double getS3() {
        return Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
    }
}


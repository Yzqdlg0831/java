import com.whpu.cwb.*;

import java.util.Scanner;

public class Text {
    static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.findArea() == object2.findArea();
    }
    static void displayGeometricObject(GeometricObject object){
        System.out.println("颜色：" + object.getColor() + " 面积：" + object.findArea() + " 周长：" + object.findPerimeter());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double L = scan.nextDouble();
        GeometricObject a = new Circle("绿色",r);
        GeometricObject b = new Rectangle("红色",L, Math.PI);
        if (equalArea(a,b)) {
            System.out.println("面积相等！");
        }else{
            System.out.println("面积不相等！");
        }
        displayGeometricObject(a);
        displayGeometricObject(b);
    }
}

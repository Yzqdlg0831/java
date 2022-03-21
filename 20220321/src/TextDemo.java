class Calculator{
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add(){
        return this.num1+this.num2;
    }

    public double subtraction(){
        return this.num1 - this.num2;
    }

    public double multiplication(){
        return this.num1*this.num2;
    }

    public double division(){
        return this.num1/this.num2;
    }
}

class Swap{
    private int a;
    private int b;

    public Swap(int a, int b) {
        this.a = a;
        this.b = b;

    }

}
public class TextDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        Swap swap = new Swap(a,b);

        System.out.println(a + " " + b);
    }
    public static void main1(String[] args) {
        Calculator a = new Calculator();
        a.setNum1(1.0);
        a.setNum2(2.0);
        System.out.println(a.add());
        System.out.println(a.subtraction());
        System.out.println(a.multiplication());
        System.out.println(a.division());
    }
}

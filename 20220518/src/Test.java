class A{
    public int s;
    int a;
    public A(){}
}
interface I{
    void fun();
}
class B extends A{
    int b;
    public B(){super();}
}
class C extends A implements I{
    int c;
    public C(){super();}

    @Override
    public void fun() {

    }
}

class Complex{
    private int RealPart;//实部
    private int ImaginPart;//虚部

    public Complex() {
        this.RealPart = 0;
        this.ImaginPart = 0;
    }

    public Complex(int r, int i) {
        this.RealPart = r;
        this.ImaginPart = i;
    }
    Complex  complexAdd(Complex  a){
        Complex tmp = new Complex();
        tmp.RealPart = this.RealPart + a.RealPart;
        tmp.ImaginPart = this.ImaginPart + a.ImaginPart;
        return tmp;
    }
    String  ToString(){
        return this.RealPart+"+"+this.ImaginPart+"i";
    }
}

public class Test {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
        System.out.println(c1.ToString());
        System.out.println(c2.ToString());
        c1 = c1.complexAdd(c2);
        System.out.println(c1.ToString());



/*        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);
        a=c;
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof I);*/
//            int x=1,y=2;
////            System.out.println("1+2="+(x+y));
//            double persons;
//            persons = x;
//        System.out.println(persons);
//        int i = 1,j = 2;
//        float x = 3.6f,y;
//        double u,v;
//        v=x;
//        y=j/i*x;
//        System.out.println(v +"          "+ y);
    }
}


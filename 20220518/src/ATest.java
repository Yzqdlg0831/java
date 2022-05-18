import    java.io.*;
public    class   ATest extends x{
    public   static   void   main(String args[]) {
        System.out.println((int)'A');
        Sub   sb = new   Sub( );
        System.out.println(sb.method1( ));      }
}
class    Super{
    int  x=1 , y=2 ;
    int  method1(){ return  x<y?x:y;  }
}
class  Sub  extends  Super{
    int  method1( ) {  return   ((x>y)?x:y);  }
}

class x{
}


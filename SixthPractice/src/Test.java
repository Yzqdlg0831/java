//编写一个异常类MyException,再编写一个类Student,
//该类有一个产生异常的方法public void speak(int m) throws MyException,
//要求参数m的值大于1000时，方法抛出一个MyException对象。最后编写主类Test，
// 在主类的main()方法中用Student创建对象，让该对象调用speak()方法进行异常处理。

import com.whpu.cwb.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.speak(2000);
        }catch(Exception e) {
            System.out.println("传入的值出现异常:"+e);
        }
    }
}
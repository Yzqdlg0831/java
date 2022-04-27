/*（1）请定义一个电脑品牌枚举类Brand ，其中只有固定的几个电脑品。例如Lenovo,Dell,Accer,ASN,Apple;
（2）为Brand枚举类添加私有数据成员：型号type、价格price；并添加get/set方法
（3）为Brand枚举类添加两个构造方法：不带参数构造方法，带两个参数构造方法，为数据成员type，price赋值。
（4）编写测试方法，调用Enum类（所有枚举类型的父类）的values()方法，打印枚举类型Brand的所有值，要求输出型号、价格。*/
import com.whpu.cwb.Brand;
public class Test2 {
    public static void main(String[] args) {
        Brand[] values = Brand.values();
        for (Brand value : values) {
            System.out.println(value.getType() + ": " + value.getPrice());
        }
    }
}

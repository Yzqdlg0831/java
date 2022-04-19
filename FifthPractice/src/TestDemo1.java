import com.whpu.cwb.*;
public class TestDemo1 {
    public static void main(String[] args) {
        Animal R = new Rabbit("小花","白色","哺乳类");
        Animal F = new Frog("小舟","绿色","非哺乳类");
        R.print();
        R.Eat();
        R.MakeASound();
        F.print();
        F.Eat();
        F.MakeASound();
        Swimmable F1 = new Frog("小蛙","绿色","非哺乳类");
        F1.swim();
    }
}

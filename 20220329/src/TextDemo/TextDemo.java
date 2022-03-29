package TextDemo;

public class TextDemo {
    public static boolean fun(String str){
        for(int i = 0;i < str.length();i++){
            char a = str.charAt(i);
            if(a > '9' || a < '0'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123456789";
        boolean bool = fun(str);
        System.out.println(bool);
    }
}

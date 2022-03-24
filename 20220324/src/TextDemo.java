class Animal{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void eat(){
        System.out.println(name+"Animal");
    }
}

class Cat extends Animal{

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

     private void eat(){
        System.out.println(name+"Cat");
    }
}

public class TextDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("coco");
        animal.eat();
    }
}

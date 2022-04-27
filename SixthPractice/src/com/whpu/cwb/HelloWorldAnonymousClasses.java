package com.whpu.cwb;

public class HelloWorldAnonymousClasses {
    interface HelloWorld {        public void greet();         }
    public void sayHello() {
        //局部类EnglishGreeting
        class EnglishGreeting implements HelloWorld {
            String name = "HelloWorld";
            public void greet(){     System.out.println(name);            }
        }//局部类class EnglishGreeting
        HelloWorld englishGreeting = new EnglishGreeting();

        //匿名类，直接创建了该匿名类对象frenchGreeting
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {            	System.out.println(name);            }
        }; //匿名类以”;”结尾
        englishGreeting.greet();//局部类对象调用greeting
        frenchGreeting.greet(); //匿名类对象调用greeting
    }
    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp =  new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
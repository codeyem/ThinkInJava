package com.yem.reuse;

/**
 * 父类的初始化调用顺序
 */
class A{
    public A(){
        System.out.println("A初始化");
    }
}

class B extends A{
    public B(){
        System.out.println("B初始化");
    }
}

class C{
    public C(int i){
        System.out.println("C初始化" + i);
    }
}

class D extends C{
    public D(){
        super(7);
        System.out.println("D初始化");
    }
}
public class Initialization {
    public static void main(String[] args) {
        B b = new B();
        D d = new D();
    }
}

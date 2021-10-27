package com.yem.reuse;
class Super{
    public int field = 1;
    public int getField(){return field;}
}
class Sub extends Super{
    public int field = 2;
    public int getField(){return field;}
    public int getSuperField(){return super.field;}
}
public class FieldAndStatic {
    public static void main(String[] args) {
        Super sup = new Sub();
        Sub s = new Sub();
        System.out.println("sub.field:" + sup.field + " sub.getField:" + sup.getField());
        System.out.println("s:" + sup.getField() + " s:" + s.getSuperField());
    }
}

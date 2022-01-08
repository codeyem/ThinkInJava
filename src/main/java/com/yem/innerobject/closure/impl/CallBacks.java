package com.yem.innerobject.closure.impl;

import com.yem.innerobject.closure.Incrementable;

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void incrment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement{
    public void increment(){
        System.out.println("开始操作");
    }
    public static void m(MyIncrement m){
        m.increment();
    }
}

class Callee2 extends MyIncrement{
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {

        @Override
        public void incrment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable incrementable){
        this.callbackReference = incrementable;
    }
    void go(){
        callbackReference.incrment();
    }
}

/**
 *
 */
public class CallBacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.m(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}

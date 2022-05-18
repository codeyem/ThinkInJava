package com.yem.unit.impl;

import com.yem.pojo.Coffee;
import com.yem.unit.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @author:yem
 * @create: 2022-05-18 21:21
 * @Description:生产Coffee对象
 */
public class CoffeeGenerator implements Generator<Coffee> {
    private Class[] type = {Coffee.class};//自己扩展
    private static Random random = new Random(47);

    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int size){
        this.size = size;
    }
    public Coffee next() {
        try{
            return (Coffee) type[random.nextInt(type.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    class CofeeIterator implements Iterator<Coffee>{
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public Iterator<Coffee> iterator(){
            return new CofeeIterator();
        }
    }

    public static void main(String[] args) {


    }
}

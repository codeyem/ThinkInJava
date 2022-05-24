package com.yem.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author:yem
 * @create: 2022-05-24 20:39
 * @Description:
 */
public class ArrayMake <T>{
    private Class<T> kind;
    private ArrayMake(Class<T> kind){this.kind = kind;}
    T[] creat(int size){
        //此时kind信息被擦除了，不能获取类型信息，所以打印的全是null
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMake<String> arrayMake = new ArrayMake<String>(String.class);
        String[] arrays = arrayMake.creat(5);
        System.out.println(Arrays.toString(arrays));
    }
}

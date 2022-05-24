package com.yem.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:yem
 * @create: 2022-05-24 20:45
 * @Description:
 */
public class ListMaker <T>{
    public List<T> create(T t , int n){
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        ListMaker<String> listMaker = new ListMaker<String>();
        System.out.println(listMaker.create("hellow",5));
    }
}

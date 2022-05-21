package com.yem.generics;

/**
 * @author:yem
 * @create: 2022-05-18 20:38
 * @Description:实现泛型类实现内部链式存储结构
 */
public class LinkedList<T>{
    private static class Node<U>{
        U itme;
        Node<U> next;
        Node(U itme, Node<U> next){
            this.itme = itme;
            this.next = next;
        }
        Node(){
            this.itme = null;
            this.next = null;
        }
        boolean end(){
            return itme == null && next == null;
        }
    }
    private Node<T> top = new Node<T>();//最后一个末尾

    public void push(T item){
        top = new Node<T>(item,top);
    }

    public T pop(){
        T result = top.itme;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<String> lss = new LinkedList<>();
        for(String s : "path of exile".split(" ")){
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null){
            System.out.println(s);
        }
    }
}

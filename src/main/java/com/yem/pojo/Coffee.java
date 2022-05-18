package com.yem.pojo;

/**
 * @author:yem
 * @create: 2022-05-18 21:18
 * @Description:
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

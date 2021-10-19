package com.yem.operate;

import org.junit.jupiter.api.Test;

/**
 * 操作符
 */
public class BitOperate {
    /**
     * 与操作符&
     * 当两个输入位都为1时，生成输出位1，否则为0
     */
    @Test
    public void test1(){
        String str1 = Integer.toBinaryString(25);
        String str2 = Integer.toBinaryString(16);
        String str3 = Integer.toBinaryString(25&16);
        System.out.println(str1 + "---" + str2);
        System.out.println(str3);
    }

    /**
     * 或操作符 |
     * 两个位置有一个为1，则输出1，否则输出0
     */
    @Test
    public void test2(){
        String str1 = Integer.toBinaryString(27);
        String str2 = Integer.toBinaryString(88);
        String str3 = Integer.toBinaryString(27|88);
        //不足位数补0
        System.out.println(str1 + "---" + str2 + "---" + str3);
    }

    /**
     *异或^操作符
     * 两个位置其中有一个为1，但不全是为1时输出为1
     *
     */
    @Test
    public void test3() {
        String str1 = Integer.toBinaryString(27);
        String str2 = Integer.toBinaryString(88);
        String str3 = Integer.toBinaryString(27^88);
        //不足位数补0
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    /**
     * 非~操作符
     * 如果为0则输出1，反之输出0
     */
    @Test
    public void test4(){
        String str1 = Integer.toBinaryString(27);
        String str2 = Integer.toBinaryString(~27);
        System.out.println(str1);
        System.out.println(str2);
    }

    /**
     * 左移位操作符<<
     * 将左侧的数字向左移动右侧数字指定的位数
     */
    @Test
    public void test5(){
        String str1 = Integer.toBinaryString(26);
        //扩大2^3倍
        String str2 = Integer.toBinaryString(26<<3);
        System.out.println(Integer.parseInt(str2,2));
        System.out.println(str1);
        System.out.println(str2);
    }

    /**
     * 右移位操作符>>
     * 将左侧的数字像右移动右侧侧数字指定的位数
     */
    @Test
    public void test6(){
        String str1 = Integer.toBinaryString(26);

        String str2 = Integer.toBinaryString(26>>3);
        System.out.println(Integer.parseInt(str2,2));
        System.out.println(str1);
        System.out.println(str2);
    }

}

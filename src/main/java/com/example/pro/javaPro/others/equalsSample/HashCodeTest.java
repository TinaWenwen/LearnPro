package com.example.pro.javaPro.others.equalsSample;

/**
 * 一个关于字符串的hash例子
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/16
 */
public class HashCodeTest {
    public static void main(String[] args) {
        String s = "ok";
        StringBuilder sb = new StringBuilder(s);

        System.out.println(s.hashCode() + "  " + sb.hashCode());

        String t = "ok";
        StringBuilder tb = new StringBuilder(s);
        System.out.println(t.hashCode() + "  " + tb.hashCode());
    }

}

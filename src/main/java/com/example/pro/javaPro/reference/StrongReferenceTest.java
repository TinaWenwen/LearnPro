package com.example.pro.javaPro.reference;

import java.util.concurrent.TimeUnit;

/**
 * 强引用
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/11/22
 */
public class StrongReferenceTest {

    public static void main(String[] args) throws InterruptedException {
        StrongReferenceTest object = new StrongReferenceTest();
        System.gc();
        //暂停一秒钟
        TimeUnit.SECONDS.sleep(1);
        //false代表对象已经获取不到被回收了 h
        System.out.println(object == null);
    }

}

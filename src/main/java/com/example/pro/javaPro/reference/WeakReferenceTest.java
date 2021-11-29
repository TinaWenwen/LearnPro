package com.example.pro.javaPro.reference;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * 弱引用
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/11/22
 */
public class WeakReferenceTest {
    static class TestObject {

    }

    public static void main(String[] args) throws InterruptedException {
        WeakReference<TestObject> weakReference = new WeakReference<>(new TestObject());

        System.out.println(weakReference.get() == null);//false

        // 只要垃圾收集 就会回收
        System.gc();
        TimeUnit.SECONDS.sleep(1);//暂停一秒钟

        System.out.println(weakReference.get() == null);//true
    }

}

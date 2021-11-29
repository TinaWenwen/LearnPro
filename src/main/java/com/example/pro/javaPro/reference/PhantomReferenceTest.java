package com.example.pro.javaPro.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 幻象引用/虚引用
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/11/22
 */
public class PhantomReferenceTest {
    static class TestObject {

    }

    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<TestObject> queue = new ReferenceQueue<>();
        PhantomReference<TestObject> phantomReference = new PhantomReference<>(new TestObject(), queue);

        // 无法被获取 只有被收集时会有一个通知
        System.out.println(phantomReference.get() == null);//true
    }
}

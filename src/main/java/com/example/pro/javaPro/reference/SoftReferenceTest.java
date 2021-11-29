package com.example.pro.javaPro.reference;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 软引用
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/11/22
 */
public class SoftReferenceTest {

    static class HeapObject {
        byte[] bs = new byte[1024 * 1024];
    }

    public static void main(String[] args) {
        SoftReference<HeapObject> softReference = new SoftReference<>(new HeapObject());

        List<HeapObject> list = new ArrayList<>();

        // 内存不足的时候回收
        while (true) {
            if (softReference.get() != null) {
                list.add(new HeapObject());
                System.out.println("list.add");
            } else {
                System.out.println("---------软引用已被回收---------");
                break;
            }
            System.gc();
        }
    }
}

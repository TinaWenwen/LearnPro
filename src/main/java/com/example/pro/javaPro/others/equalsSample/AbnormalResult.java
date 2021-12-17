package com.example.pro.javaPro.others.equalsSample;

import java.util.ArrayList;
import java.util.List;

/**
 * 不遵循规则的反向例子
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/16
 */
public class AbnormalResult {
    public static void main(String[] args) {
        List<A> list = new ArrayList<A>();
        A a = new A();
        B b = new B();
        list.add(a);
        System.out.println("list.contains(a)->" + list.contains(a));
        System.out.println("list.contains(b)->" + list.contains(b));
        list.clear();
        list.add(b);
        System.out.println("list.contains(a)->" + list.contains(a));
        System.out.println("list.contains(b)->" + list.contains(b));
    }

    static class A {
        @Override
        public boolean equals(Object obj) {
            return obj instanceof A;
        }
    }

    static class B extends A {
        @Override
        public boolean equals(Object obj) {
            return obj instanceof B;
        }

        // 正确写法
//        @Override
//        public boolean equals(Object obj) {
//            if(obj instanceof B){
//                return true;
//            }
//            return super.equals(obj);
//        }

    }
}

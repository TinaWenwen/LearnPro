package com.example.pro.javaPro.others.equalsSample;

import java.util.HashSet;
import java.util.Set;

/**
 * 为何重写equals必须要重写hashCode
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/15
 */
public class MyCustomObject {
    int intVal1;
    int intVal2;

    public MyCustomObject(int val1, int val2) {
        intVal1 = val1;
        intVal2 = val2;
    }

    @Override
    public boolean equals(Object obj) {
        return (((MyCustomObject) obj).intVal1 == this.intVal1) &&
                (((MyCustomObject) obj).intVal2 == this.intVal2);
    }

    public static void main(String[] args) {
        // It works for you because your code does not use any functionality (HashMap, HashTable) which needs the hashCode() API.
//        MyCustomObject m1 = new MyCustomObject(3, 5);
//        MyCustomObject m2 = new MyCustomObject(3, 5);
//        MyCustomObject m3 = new MyCustomObject(4, 5);
//
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.equals(m3));


        Set<Box> s = new HashSet<Box>();
        Box b = new Box();
        b.setValue("hello");
        s.add(b);
        System.out.println(s.contains(b));
        b.setValue("other");
        System.out.println(s.contains(b));
        // TRUE!!! b is in s but contains(b) returns false
        System.out.println(s.iterator().next() == b);
    }

    public static class Box {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && getClass().equals(obj.getClass())) {
                return ((Box) obj).value.equals(value);
            } else {
                return false;
            }
        }
    }

}

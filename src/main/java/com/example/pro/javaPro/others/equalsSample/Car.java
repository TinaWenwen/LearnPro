package com.example.pro.javaPro.others.equalsSample;

/**
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/15
 */
public class Car {
    private int batch;

    public Car(int batch) {
        this.batch = batch;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public static void main(String[] args) {
        Car c1 = new Car(1);
        Car c2 = new Car(1);
        // 没有重写equals equals默认底层是==比较 比的是内存地址
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }

}

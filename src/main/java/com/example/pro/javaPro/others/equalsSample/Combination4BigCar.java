package com.example.pro.javaPro.others.equalsSample;

/**
 * 组合的方法解决传递性原则问题
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/16
 */
public class Combination4BigCar {
    private Car1 c;
    private int count;

    public Combination4BigCar(int batch, int count) {
        c = new Car1(batch);
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Combination4BigCar) {
            Combination4BigCar bc = (Combination4BigCar) obj;
            return c.equals(bc.c) && count == bc.count;
        }
        return false;
    }

    public static void main(String[] args) {
        Car2 c = new Car2(1);
        Combination4BigCar bc = new Combination4BigCar(1, 20);
        Combination4BigCar bc2 = new Combination4BigCar(1, 22);
        // 两个不同的类本不应该用equals比较 应该都返回false
        System.out.println(bc.equals(c));
        System.out.println(c.equals(bc2));
        System.out.println(bc.equals(bc2));
    }

}

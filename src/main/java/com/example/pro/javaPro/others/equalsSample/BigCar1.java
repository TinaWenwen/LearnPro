package com.example.pro.javaPro.others.equalsSample;

/**
 * 符合对称性 但没符合传递性
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/15
 */
public class BigCar1 extends Car2 {
    int count;

    public BigCar1(int batch, int count) {
        super(batch);
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BigCar1) {
            BigCar1 bc = (BigCar1) obj;
            return super.equals(bc) && count == bc.count;
        }
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Car2 c = new Car2(1);
        BigCar1 bc = new BigCar1(1, 20);
        BigCar1 bc2 = new BigCar1(1, 22);
        // 符合对称性
        System.out.println(bc.equals(c));
        System.out.println(c.equals(bc2));
        // 不符合传递性
        System.out.println(bc.equals(bc2));
    }
}

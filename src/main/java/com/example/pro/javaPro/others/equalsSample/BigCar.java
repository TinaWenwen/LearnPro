package com.example.pro.javaPro.others.equalsSample;

/**
 * 父子类混合比较equals
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/15
 */
public class BigCar extends Car2 {

    int count;

    public BigCar(int batch, int count) {
        super(batch);
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BigCar) {
            BigCar bc = (BigCar) obj;
            return super.equals(bc) && count == bc.count;
        }
        return false;
    }

    public static void main(String[] args) {
        Car2 c = new Car2(1);
        BigCar bc = new BigCar(1, 20);
        // 违背了对称性
        System.out.println(c.equals(bc));
        System.out.println(bc.equals(c));
    }

}

package com.example.pro.javaPro.others.equalsSample;

/**
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/15
 */
public class Car1 {
    private final int batch;

    public Car1(int batch) {
        this.batch = batch;
    }

    public int getBatch() {
        return batch;
    }

    /**
     * 重写equals方法 让他们不再用内存地址比较
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car1) {
            Car1 c = (Car1) obj;
            return batch == c.getBatch();
        }
        return false;
    }

    public static void main(String[] args) {
        Car1 c1 = new Car1(1);
        Car1 c2 = new Car1(1);
        // 这里重写了equals方法 equals比较的是batch的值
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }
}

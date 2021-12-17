package com.example.pro.javaPro.others.equalsSample;

/**
 * equals重写规则
 * 自反性。对于任何非null的引用值x，x.equals(x)应返回true。
 * <p>
 * 对称性。对于任何非null的引用值x与y，当且仅当：y.equals(x)返回true时，x.equals(y)才返回true。
 * <p>
 * 传递性。对于任何非null的引用值x、y与z，如果y.equals(x)返回true，y.equals(z)返回true，那么x.equals(z)也应返回true。
 * <p>
 * 一致性。对于任何非null的引用值x与y，假设对象上equals比较中的信息没有被修改，则多次调用x.equals(y)始终返回true或者始终返回false。
 * <p>
 * 对于任何非空引用值x，x.equal(null)应返回false。
 *
 * @author Tina Xu
 * @version 1.0
 * @description
 * @create 2021/12/15
 */
public class Car2 {
    private final int batch;

    public Car2(int batch) {
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
        if (obj instanceof Car2) {
            Car2 c = (Car2) obj;
            return batch == c.getBatch();
        }
        return false;
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2(1);
        Car2 c2 = new Car2(1);
        Car2 c3 = new Car2(1);
        System.out.println("自反性->c1.equals(c1)：" + c1.equals(c1));
        System.out.println("对称性：");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        System.out.println("传递性：");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println("一致性：");
        for (int i = 0; i < 50; i++) {
            if (c1.equals(c2) != c1.equals(c2)) {
                System.out.println("equals方法没有遵守一致性！");
                break;
            }
        }
        System.out.println("equals方法遵守一致性！");
        System.out.println("与null比较：");
        System.out.println(c1.equals(null));

    }
}

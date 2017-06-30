package main.java.simple.factory.extend;

/**
 * 猴子继承类
 * @author lichenyi
 * @date 2017/6/30 0030 11:43
 */
public class Monkey extends Animal{
    @Override
    public void say() {
        System.out.println  ("猴子");
    }
}

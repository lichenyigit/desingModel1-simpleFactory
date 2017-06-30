package main.java.simple.factory.impl.impl;

import main.java.simple.factory.impl.Human;

/**
 * 男人实现类
 * @param:
 * @return
 * @author lichenyi
 * @date 2017/6/30 003011:33
 */
public class Man implements Human {
    @Override
    public String say() {
        return "男人";
    }
}

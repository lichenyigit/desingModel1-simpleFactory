package main.java.simple.factory.impl.impl;

import main.java.simple.factory.impl.Human;


/**
 * 女人实现类
 *
 * @author lichenyi
 * @param:
 * @return
 * @date 2017/6/30 003011:31
 */
public class Women implements Human {
    @Override
    public String say() {
        return "女人";
    }
}

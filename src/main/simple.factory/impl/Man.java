package main.java.simple.factory.impl;

import main.java.simple.factory.impl.impl.Human;

/**
 * Created by lichenyi on 2017/6/29 0029.
 */
public class Man implements Human {
    @Override
    public String say() {
        return "男人";
    }
}

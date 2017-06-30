package test.java.simple.factory.extend;

import main.java.simple.factory.extend.Animal;
import main.java.simple.factory.extend.Monkey;
import main.java.simple.factory.extend.Snake;

/**
 * 继承工厂测试类
 * @author lichenyi
 * @date 2017/6/30 0030 11:44
 */
public class Test2 {

    public static void main(String args[]) {
        Animal monkey = new Monkey();
        monkey.say();
        Animal snake = new Snake();
        snake.say();
    }

}

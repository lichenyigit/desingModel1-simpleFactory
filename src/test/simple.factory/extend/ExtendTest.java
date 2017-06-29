package test.java.simple.factory.extend;

import main.java.simple.factory.extend.Animal;
import main.java.simple.factory.extend.Monkey;
import main.java.simple.factory.extend.Snake;

/**
 * Created by lichenyi on 2017/6/29 0029.
 */
public class Test2 {

    public static void main(String args[]) {
        Animal monkey = new Monkey();
        monkey.say();
        Animal snake = new Snake();
        snake.say();
    }

}

package test.java.simple.factory.impl;

import main.java.simple.factory.impl.impl.Human;
import main.java.simple.factory.impl.Man;
import main.java.simple.factory.impl.impl.Women;

/**
 * 接口工厂测试类
 * @param:
 * @return
 * @author lichenyi
 * @date 2017/6/30 003011:34
 */
public class Test1 {

   public static void main(String args[]) {
       //TODO
       Human man = new Man();
       Human women = new Women();
       System.out.println(man.say());
       System.out.println(women.say());
   }

}

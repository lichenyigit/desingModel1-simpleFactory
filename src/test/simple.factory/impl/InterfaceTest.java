package test.java.simple.factory.impl;

import main.java.simple.factory.impl.impl.Human;
import main.java.simple.factory.impl.Man;
import main.java.simple.factory.impl.impl.Women;

/**
 * Created by lichenyi on 2017/6/29 0029.
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

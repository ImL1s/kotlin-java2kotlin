package com.cbstudio.java2kotlin.classAndObject.kotlinConst;

import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.Hello;
import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.KotlinConstTest;
import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.Person;

import org.junit.Test;


/**
 * Created by ImL1s on 07/02/2018.
 * Description:
 */

public class KotlinConstTestJava {

    @Test
    public void test() {
        println(Hello.nameConst);
        println(Hello.getNameVal());

        println(Person.INSTANCE.getNameVal());
        println(Person.nameConst);

        println(new KotlinConstTest().getNameVal());
    }

    public static void println(String str) {
        System.out.println(str);
    }
}

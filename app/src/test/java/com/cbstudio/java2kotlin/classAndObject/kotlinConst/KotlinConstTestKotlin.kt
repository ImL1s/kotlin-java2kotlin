package com.cbstudio.java2kotlin.classAndObject.kotlinConst

import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.KotlinConstTest
import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.Person
import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.nameConst
import com.cbstudio.java2kotlin.classAndObject.kotlinConst.model.nameVal

import org.junit.Test


/**
 * Created by ImL1s on 07/02/2018.
 * Description:
 */

class KotlinConstTestKotlin {

    @Test
    fun test() {
        println(nameConst)
        println(nameVal)

        println(Person.nameVal)
        println(Person.nameConst)

        println(KotlinConstTest().nameVal)
    }

    companion object {

        fun println(str: String) {
            println(str)
        }
    }
}

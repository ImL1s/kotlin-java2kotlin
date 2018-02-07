@file:JvmName("Hello")
package com.cbstudio.java2kotlin.classAndObject.kotlinConst.model


/**
 * Created by ImL1s on 07/02/2018.
 * Description:
 */
class KotlinConstTest {

//     error, Const 'val' are only allowed on top level or in objects.
//    const val nameConst = "samConst"

    val nameVal = "samVal"
}

const val nameConst = "samConst"
val nameVal = "samVal"

object Person {
    const val nameConst = "samConst"
    val nameVal = "samVal"
}
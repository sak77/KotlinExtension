package com.saket.kotlinextension

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Kotlin provides an ability to extend a class with new functionality without having to inherit from
 * the class or use design patterns such as Decorator.
 * This is done via special declarations called extensions.
 */

//In most cases, you define extensions on the top level.
fun Math.add(a: Int, b: Int, c: Int) = a + b + c

fun Math.mod(a: Int, b : Int) = a % b

//The this keyword inside an extension function corresponds
// to the receiver object (the one that is passed before the dot)
fun Math.isEven(a: Int) = this.mod(a, 2) == 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myMath = Math()
        val a = 1
        val b = 2
        val c = 3

        println("Add $a and $b gives ${myMath.add(a, b)}")
        println("Add $a, $b and $c gives ${myMath.add(a, b, c)}")

        println("Modulo $c on $b is ${myMath.mod(c, b)}")

        println("$c is even ? ${myMath.isEven(c)}")
    }
}
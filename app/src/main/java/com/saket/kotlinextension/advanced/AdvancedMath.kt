package com.saket.kotlinextension.advanced

import com.saket.kotlinextension.Math
import com.saket.kotlinextension.add

/**
 * Here we demonstrate how to import extension functions defined in one
 * package to another package.
 *
 * Math.add(a,b,c) is imported here
 */
class AdvancedMath {

    fun timesThree(a: Int) : Int {
      val myMath = Math()
      return myMath.add(a, a, a)
    }
}
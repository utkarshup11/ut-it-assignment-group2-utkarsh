package ques2

import org.scalatest.flatspec.AnyFlatSpec

class TestFactorial extends AnyFlatSpec with FindFactorial {


  override def calculateFactorial(number: Int): Int = {
    var fact = 1
    for (counter <- 1 to number) {
      fact = fact * counter
    }
    return fact

  }

  "factorial of 0 " should " be 1 " in {
    assert(calculateFactorial(0) == 1)
  }

  "factorial of 1 " should " be 1 " in {
    assert(calculateFactorial(1) == 1)
  }

  "factorial of 2 " should " be 2 " in {
    assert(calculateFactorial(2) == 2)
  }

  "factorial of any other number " should " be calculated correctly" in {
    assert(calculateFactorial(5) == 120)
  }

}

package ques2

import org.agrona.collections.NullReference
import org.scalatest.flatspec.AnyFlatSpec

import java.lang.annotation.AnnotationTypeMismatchException

//class to implement the test cases for checking palindrome
class TestPalindrome extends AnyFlatSpec with CheckPalindrome {

  //method to check the number is palindrome or not
  override def isPalindrome(no: Int): Boolean = {
    var number = no
    val copy = number
    var reverse = 0

    if (number == 0)
      return true
    else {
      while (number != 0) {
        reverse = reverse * 10 + (number % 10)
        number /= 10
      }

      if (reverse == copy)
        return true
      else
        return false

    }
  }

  "a number of one digit " should " always be palindrome " in
  {
    assert(isPalindrome(1))
  }

  "a number of two digit (even length ) " should " be valid for palindrome " in
  {
    assert(isPalindrome(88))
  }

  "a number of three (odd length ) digit " should " be valid for palindrome " in
  {
    assert(isPalindrome(121))
  }

  "a number which is  0 " should " be valid for palindrome " in
    {
      assert(isPalindrome(0))
    }











}

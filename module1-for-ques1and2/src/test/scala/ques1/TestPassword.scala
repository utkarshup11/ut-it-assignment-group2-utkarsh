package ques1

import org.scalatest.flatspec.AnyFlatSpec

//class to create test cases for various conditions to validate password
class TestPassword extends AnyFlatSpec {

  var passwordValidator = new PasswordValidator()

  "password " should "not contain any space " in {
    assert( ! passwordValidator.isValidPassword("Hell o123@"))
  }

  "password " should "contain at least one digit from 0 to 9 " in {
    assert(passwordValidator.isValidPassword("HelloAman@1"))
  }

  "password " should "contain at least one lowercase letter  " in {
    assert(passwordValidator.isValidPassword("Utkarsh123%"))
  }

  "password " should "contain at least one Uppercase " in {
    assert(passwordValidator.isValidPassword("knolDus@1"))
  }

  "password " should "have at least one special character" in {
    assert(passwordValidator.isValidPassword("Special@123"))

  }

  "length of password " should "be between 8-15 characters " in {
    assert(passwordValidator.isValidPassword("Lenhh@111"))

  }

}

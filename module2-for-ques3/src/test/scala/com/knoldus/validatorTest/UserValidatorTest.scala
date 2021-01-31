package com.knoldus.validatorTest

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends  AnyFlatSpec
{
  val userValidatorTest = new UserValidator()
  val validUser: User =
    User("utkarsh", "utkarshup11@gmail.com", 21, "Gorakhpur", "Knoldus")

  val invalidUser: User =
    User("utkarsh", "utkarshup 11@gmail.com", 21, "Gorakhpur", "Knoldus")

  "a user " should " valid only if its company exist in db and emiail id is valid " in
  {
    assert(userValidatorTest.userIsValid(validUser))
  }

  it should "not be valid if email id is not valid " in
  {
    assert( ! userValidatorTest.userIsValid(invalidUser))
  }



}

package com.knoldus.validatorTest

import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends  AnyFlatSpec
{

  var emailValidatorTest = new EmailValidator()

  "a email id " should " only be valid if its follow condition " in
  {
    assert(emailValidatorTest.emailIdIsValid("utkarshup11@gmail.com"))
  }

  "a email id " should " not be valid if does not contain @ " in
  {
    assert( ! emailValidatorTest.emailIdIsValid("utkarshup11gmail.com"))
  }
}

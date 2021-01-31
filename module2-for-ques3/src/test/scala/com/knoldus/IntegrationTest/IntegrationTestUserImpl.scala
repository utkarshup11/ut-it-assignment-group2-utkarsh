package com.knoldus.IntegrationTest

import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec


// a class to write integration test case for class UserImpl
class IntegrationTestUserImpl extends AnyFlatSpec {
  val utkarshUser: User =
    User("utkarsh", "utkarshup11@gmail.com", 21, "Gorakhpur", "Knoldus")

  val userValidator = new UserValidator()
  val userImpl = new UserImpl(userValidator)

  "a user" can "only be created if it is valid " in {
    assert(userImpl.createUser(utkarshUser) == Option(utkarshUser.name))
  }
}

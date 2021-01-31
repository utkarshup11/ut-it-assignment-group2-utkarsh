package com.knoldus.requestTest

import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplMockTest extends AnyFlatSpec
{
    val mockObject = mock[UserValidator]
    val userImpl = new UserImpl(mockObject)

  val utkarshUser: User =
    User("utkarsh", "utkarshup11@gmail.com", 21, "Gorakhpur", "Knoldus")

  val surajUser: User =
    User("Suraj", "surajraj@gmail.com", 21, "Gorakhpur", "TCS")

  "the user " should "be valid only if it is valid " in
  {
    when( mockObject.userIsValid(utkarshUser) ) thenReturn(true)
    assert(userImpl.createUser(utkarshUser) == Option(utkarshUser.name))
  }


  "the user" should " not be valid if it is not valid " in
  {
    when(mockObject.userIsValid(surajUser)) thenReturn(false)
    assert(userImpl.createUser(surajUser) == None)
  }





}

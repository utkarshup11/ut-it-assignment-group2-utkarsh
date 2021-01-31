package com.knoldus.dbTest

import com.knoldus.db.UserReadDto
import org.scalatest.flatspec.AnyFlatSpec

class UserReadDtoTest extends AnyFlatSpec
{
  val userTest = new UserReadDto()

  " userReadDto class " should "return object of user class " in
  {
    assert(userTest.getUserByName("utkarsh").isDefined)
  }

}

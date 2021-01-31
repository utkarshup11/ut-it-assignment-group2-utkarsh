package com.knoldus.dbTest

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadDtoTest  extends  AnyFlatSpec
{

  val companyReadDto = new CompanyReadDto()


  "companyReadDto class " should "return object of company " in
  {
    assert(companyReadDto.getCompanyByName("Knoldus").isDefined )
  }


}

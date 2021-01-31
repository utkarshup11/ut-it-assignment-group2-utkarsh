package com.knoldus.validatorTest

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends  AnyFlatSpec
{
  val companyValidatorTest = new CompanyValidator()
  val validCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val invalidCompany: Company = Company("Aman", "aman @gmail.com", "Noida")


  "a company" should "be valid only if it already not exist in db and email id is valid  " in
  {
    assert(companyValidatorTest.companyIsValid(validCompany))
  }

  "a company " should " not be valid if its mail id is not valid " in
  {
      assert(!companyValidatorTest.companyIsValid(invalidCompany))
  }
}

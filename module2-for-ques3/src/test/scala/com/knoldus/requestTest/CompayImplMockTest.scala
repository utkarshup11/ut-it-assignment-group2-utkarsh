package com.knoldus.requestTest
import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class CompayImplMockTest extends  AnyFlatSpec
{

  val mockCompanyImpl = mock[CompanyValidator]
  val compImpl = new CompanyImpl(mockCompanyImpl)
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val cloudCompany : Company = Company("Cloud", "cloud@gmail.com", "Sector62")



  "the company " should "be created only if it is valid " in
  {
    when(mockCompanyImpl.companyIsValid(knoldusCompany)) thenReturn(true)
    assert(compImpl.createCompany(knoldusCompany) == Option(knoldusCompany.name))
  }

  "the company " should "be not be created  if it is not valid " in
    {
      when(mockCompanyImpl.companyIsValid(cloudCompany)) thenReturn(false)
      assert(compImpl.createCompany(cloudCompany) == None)
    }



}

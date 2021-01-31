package com.knoldus.IntegrationTest

import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

// a class to write integration test case for class CompanyImpl
class IntegrationTestCompanyImpl extends AnyFlatSpec {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val invalidCompany: Company = Company("cloud", "@gmail.com", "Russia")

    var companyValidator = new CompanyValidator()
    var companyImpl = new CompanyImpl(companyValidator)

    "a company" can "be created only if it is valid " in {
        assert(
            companyImpl.createCompany(knoldusCompany) == Option(knoldusCompany.name)
        )
    }


    "a company" can "not be created  if its email id is not valid " in {
        assert(
            companyImpl.createCompany(invalidCompany) != Option(invalidCompany.name)
        )
    }

}

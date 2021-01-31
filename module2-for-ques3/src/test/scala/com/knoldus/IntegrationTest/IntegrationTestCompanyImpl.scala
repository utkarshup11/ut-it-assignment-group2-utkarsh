package com.knoldus.IntegrationTest

import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

// a class to write integration test case for class CompanyImpl
class IntegrationTestCompanyImpl extends AnyFlatSpec {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    var companyValidator = new CompanyValidator()
    var companyImpl = new CompanyImpl(companyValidator)

    "a company" can "be created if it is valid " in {
        assert(
            companyImpl.createCompany(knoldusCompany) == Option(knoldusCompany.name)
        )
    }

}

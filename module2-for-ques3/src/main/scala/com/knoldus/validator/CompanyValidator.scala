package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company


class CompanyValidator {

  //this method returns true if company is valid
  def companyIsValid(company: Company): Boolean = {
    val companyInThisClass = company.name
    val companyReadDto = new CompanyReadDto()
    val companyInCompanyReadDto = companyReadDto.getCompanyByName(company.name)
    val emailValidator = new EmailValidator()

    if (
      !companyInThisClass.equals(companyInCompanyReadDto) &&
        emailValidator.emailIdIsValid(company.emailId)
    )
      true

    else
      false

  }
}

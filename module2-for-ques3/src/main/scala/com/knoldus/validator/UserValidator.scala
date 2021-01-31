package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User


// a class to check user is valid or not according to provided constraints in question
class UserValidator {

  def userIsValid(user: User): Boolean = {


    //checking if company  exist in db and email valid or not
    val companyDto = new CompanyReadDto()
    val userCompany = user.companyName
    val companyExist = companyDto.getCompanyByName(user.companyName)
    val emailValidator = new EmailValidator()

    if (
      !userCompany
        .equals(companyExist) && emailValidator.emailIdIsValid(user.emailId)
    )
      true
    else
      false
  }

}

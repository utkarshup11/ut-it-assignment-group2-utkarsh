package com.knoldus.validator


// class to check the email id is valid or not
class EmailValidator {


  def emailIdIsValid(emailId: String): Boolean = {
    if (
      """^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(aero|arpa|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel|[a-z][a-z])$""".r
        .findFirstIn(emailId) == None
    )
      false
    else
      true
  }
}

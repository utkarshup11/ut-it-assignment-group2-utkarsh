package ques1

// a class for writing methods to validate the password
class PasswordValidator {

  // a method to check some constraints of passwords
  def isValidPassword(password: String): Boolean = {


    // checks the condition of password by taking the reference of given regular expression
    if (
      password.matches(
        "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%=:\\?]).{8,15})"
      ) && !password.matches(".*\\s.*")
    )
      true


    else
      false

  }
}

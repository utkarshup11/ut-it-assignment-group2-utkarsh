package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

//creating a class to use it as a database for User operations
class UserReadDto {
  val utkarshUser: User =
    User("utkarsh", "utkarshup11@gmail.com", 21, "Gorakhpur", "Knoldus")

  val upendraUser: User =
    User("Upendra Singh", "upendra11@gmail.com", 22, "Kanpur", "HudsonData")

  val kushagraUser: User =
    User("Kushagra Singh", "kush11@gmail.com", 25, "Lucknow", "Cloud Analogy")

  val users: HashMap[String, User] = HashMap(
    "utkarsh" -> utkarshUser,
    "Upendra Singh" -> upendraUser,
    "Kushagra Singh " -> kushagraUser
  )

  def getUserByName(name: String): Option[User] = users.get(name)

}

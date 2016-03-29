package model

import scala.collection.mutable.ListBuffer

/**
  * Created by knodus on 29/2/16.
  */
object Account {

  var listOfUser = ListBuffer(("sang@sang.com","1234"))


  def createUser(email: String, password: String): Unit = {
    listOfUser += ((email, password))
  }

  def validate(email:String,password:String):Boolean={
    if(listOfUser.contains((email,password)))
      true
    else
      false
  }

  def changeUserEmail(email:String,newEmail:String)={

    listOfUser.update(listOfUser.indexOf(email),(newEmail,listOfUser(listOfUser.indexOf(email))._1))

  }


}


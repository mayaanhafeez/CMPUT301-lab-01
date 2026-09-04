package com.example.petshop

class Happy(date:String) : Mood(date){
  override fun get_mood():String{
    println("$date")
    return "happy"
  }
}

package com.example.petshop

class Sad(date:String) : Mood(date){
  override fun get_mood():String {
    println("$date")
    return "sad"
  }
}

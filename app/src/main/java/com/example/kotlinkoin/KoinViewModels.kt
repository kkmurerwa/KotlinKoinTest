package com.example.kotlinkoin

class Student(private val course: SchoolCourse, private val friend: Friend){
    fun beSmart() {
        course.study()
        friend.hangOut()
    }
}

class SchoolCourse {
    fun study(){
        println("We are studying")
    }
}

class Friend {
    fun hangOut() {
        println("We are hanging out")
    }
}
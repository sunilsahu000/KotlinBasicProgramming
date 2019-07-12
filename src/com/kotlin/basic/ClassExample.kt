package com.kotlin.basic

fun main(str: Array<String>) {
    var emp = Employee()
    emp.name = "Tom"
    emp.printName()

    var p = Person("John")
    p.displayName()
}

class Employee {
    var name : String = ""

    fun printName() {
        println(name)
    }
}
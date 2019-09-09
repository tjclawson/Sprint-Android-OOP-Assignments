package com.lambdaschool.httpoperations.model

import android.util.Log

data class EmployeeJson(open val name:String, open val id: Int, open val age:Int, open val title: String)

open class Employee(open val name:String, open val id: Int, open val age:Int, open val title: String) {
    var email: String = "$title$name@bigcorp.com"

    open fun signature(): String {
        return "Best regards,\n$name, $title\n$email\n"
    }
}

// TODO 5: Try to make some subclasses of this class. Is there an issue?
//have to make vals in Employee open and then override them in the Engineer class, but, since they should be the same, we can pass them in
//instead of overriding


class Engineer(name: String, id: Int, age: Int, title: String): Employee(name, id, age, title) {
    fun doEngineering(){
        Log.i("Employee", "Doing Engineering")
    }
}

class Officer(name: String, id: Int, age: Int, title: String): Employee(name, id, age, title) {

    val keyToBroadroom: String = "sadkjfhskdfhsdf"
    fun goToBoardMeeting(){
        Log.i("Employee", "Board Meeting")
    }

    override fun signature(): String {
        return "Best regards,\n$name, $title\n"
    }
}

class Tester(name: String, id: Int, age: Int, title: String): Employee(name, id, age, title) {
    fun approveForProduction(){
        Log.i("Employee", "Testing")
    }
}

class Designer(name: String, id: Int, age: Int, title: String): Employee(name, id, age, title) {
    fun buildWirefram(){
        Log.i("Employee", "BuildWireframe")
    }
}

// TODO 6: Make the Employee class open and start to derive some subclasses (CLevelEmployee, Engineer, etc.)

/* TODO 7: Make a function in the Employee class to return an email address as a String.
    Use the format "$name@bigcorp.com"
 */

/* TODO 8: Add a function to the Employee class to generate an email signature.
    The signature should start "Best regards,\n$name, $title\n"
    For non-C-level employees, add the email address on the next line
    For C-level employees, don't include the email address
 */

// TODO 9: Make up some data to use
object employeesFakeData : ArrayList<Employee>(
    arrayListOf(
        Engineer(
            name = "Steve",
            id = 1,
            age = 25,
            title = "Engineer"
        ),
        Engineer(
            name = "Mark",
            id = 2,
            age = 25,
            title = "Engineer"
        ),
        Officer(
            name = "Daniel",
            id = 3,
            age = 45,
            title = "CTO"
        ),
        Officer(
            name = "Justin",
            id = 4,
            age = 55,
            title = "CEO"
        ),
        Tester(
            name = "Matt",
            id = 5,
            age = 30,
            title = "Tester"
        ),
        Designer(
            name = "Mike",
            id = 6,
            age = 31,
            title = "UX Designer"
        )
    )
)
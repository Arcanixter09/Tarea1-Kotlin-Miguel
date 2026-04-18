fun main() {
    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting(name = "Rex", age = 2))
    println(birthdayGreeting(age = 5))
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}

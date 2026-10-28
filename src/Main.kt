//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Welcome to your banking system.")
    println()
    println("What type of account would you like to create?")
    println()
    println("1. Debit account")
    println()
    println("2. Credit account")
    println()
    println("3. Checking acoount ")
    println()

    var accountType = ""

    var userChoice = 0
    while (accountType == ""){
        println("Choose an option (1, 2 or 3")
        userChoice = IntRange(1,5).random()
        println("The selected option is $userChoice")

       when(userChoice){
            1 -> accountType = "Debit Account"
            2 -> accountType = "Credit Account"
            3 -> accountType = "Checking Account"
            else -> continue
        }
        println("You have created a $accountType account.")
    }
}
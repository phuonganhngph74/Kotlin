package com.example.bankaccountprogramm
    fun main() {
        val lilyAccount = BankAccount("Lily", 100.0)
        lilyAccount.deposit(50.0)
        lilyAccount.withdraw(75.0)
        lilyAccount.withdraw(500.0)
        lilyAccount.displayTransactionHistory()
        println("account holder : ${lilyAccount.accountHolder}")
        println("Balance of ${lilyAccount.accountHolder}'s account: ${lilyAccount.accBalance()}")

        val sahrahAccount = BankAccount("Sahrah", 0.0)
        sahrahAccount.deposit(100.0)
        sahrahAccount.withdraw(10.0)
        sahrahAccount.deposit(300.0)
        sahrahAccount.displayTransactionHistory()
        println("Balance of ${sahrahAccount.accountHolder}'s account: ${sahrahAccount.accBalance()}")
    }

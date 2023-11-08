package com.example.bankaccountprogramm

class BankAccount(
    var accountHolder:String,
    var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    /** TODO: This Method should add the amount the the balance,
    and add a transaction to the transactionHistory list
     * @param amount the amount to deposit
     */
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    /** TODO: This Method should subtract the amount from the balance,
    and add a transaction to the transactionHistory list
    If there are insufficient funds, the balance won't be changed
     *  @param amount the amount to withdraw
     */
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            transactionHistory.add("$accountHolder tried to withdraw $$amount, but there was insufficient funds")
        }
    }

    /* TODO: This Method should return the current balance
     */
    fun accBalance(): Double {
        return balance
    }

    /** TODO: This Method should print out the transaction history
     */
    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder:")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

}
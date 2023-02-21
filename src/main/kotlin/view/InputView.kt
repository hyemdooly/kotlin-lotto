package view

class InputView {
    fun inputAmount(): Int {
        return readln().toInt()
    }
    fun inputWinningNumbers(): List<Int> {
        return readln().replace("\\s".toRegex(), "").split(",").map { it.toInt() }
    }
    fun inputBonusNumber(): Int {
        return readln().toInt()
    }
    fun inputCount(): Int {
        return readln().toInt()
    }
    fun inputManualLotto(): String {
        return readln().replace("\\s".toRegex(), "")
    }
}

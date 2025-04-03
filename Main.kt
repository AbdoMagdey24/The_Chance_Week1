fun check(name: String, result: Boolean, correct: Boolean) {
    if (result == correct) {
        println("success - $name")
    } else {
        println("failed - ($name)... it should return $correct but it returns: $result")
    }
}

fun returnTrueForValidSudoku(sudoku: List<List<Char>>) {
    check(
        name = "return true if sudoku has no duplicate",
        result = isValidSudoku(sudoku),
        correct = true
    )
}

fun returnFalseIfRowHasDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return false if row has duplicate",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseIfColumnHasDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return false if column has duplicate",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseIfBoxHasDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return false if box has duplicate",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseForInvalidChars(sudoku: List<List<Char>>) {
    check(
        name = "return false if sudoku with invalid chars",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseIfSudokuIsEmpty(sudoku: List<List<Char>>) {
    check(
        name = "return false if sudoku is empty",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

fun returnFalseIfSudokuIsNotNxN(sudoku: List<List<Char>>) {
    check(
        name = "return false if sudoku isn't n x n",
        result = isValidSudoku(sudoku),
        correct = false
    )
}

val validSudoku = listOf(
    listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
)

val invalidRow = listOf(
    listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7', '7') // Duplicate 7 in row
)

val invalidColumn = listOf(
    listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('5', '-', '-', '-', '8', '-', '-', '7', '9') // Duplicate 5 in column
)

val invalidBox = listOf(
    listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7', '8') // Duplicate 8 in 3x3 box
)

val invalidChars = listOf(
    listOf('a', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', 'H', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7', 'I')
)

val invalidSize = listOf(
    listOf('3', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7')
)

fun main() {
    returnTrueForValidSudoku(validSudoku)


    returnFalseIfRowHasDuplicate(invalidRow)

    returnFalseIfColumnHasDuplicate(invalidColumn)

    returnFalseIfBoxHasDuplicate(invalidBox)

    returnFalseForInvalidChars(invalidChars)

    returnFalseIfSudokuIsEmpty(listOf())

    returnFalseIfSudokuIsNotNxN(invalidSize)
}

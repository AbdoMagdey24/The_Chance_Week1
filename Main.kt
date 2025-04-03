fun checkSudokuValidation(name: String, sudoku: List<List<Char>>, expected: Boolean) {
    val result = isValidSudoku(sudoku)
    if (result == expected) {
        println("success - $name")
    } else {
        println("failed - ($name)... it should return $expected but it returns: $result")
    }
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

val invalidSudokuBox = listOf(
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

val invalidSudokuColumn = listOf(
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

val invalidSudokuRow = listOf(
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

val invalidSudoku4x4NonDigit = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('4', '3', '2', '1'),
    listOf('2', '1', '4', 'a')  // a
)

val validSudoku4x4 = listOf(
    listOf('1', '2', '3', '4'),
    listOf('3', '4', '1', '2'),
    listOf('2', '1', '4', '3'),
    listOf('4', '3', '2', '1')
)

val invalidSudoku4x4Row = listOf(
    listOf('1', '2', '.', '1'),
    listOf('.', '4', '1', '2'),
    listOf('2', '.', '4', '3'),
    listOf('4', '3', '2', '1')
)


fun main() {
    checkSudokuValidation("Valid Sudoku", validSudoku, true)

    checkSudokuValidation("Sudoku with duplicate in row", invalidSudokuRow, false)

    checkSudokuValidation("Sudoku with duplicate in column", invalidSudokuColumn, false)

    checkSudokuValidation("Sudoku with duplicate in box", invalidSudokuBox, false)

    checkSudokuValidation("Sudoku with invalid characters", invalidChars, false)

    checkSudokuValidation("Non 9x9 Sudoku grid", invalidSize, false)

    checkSudokuValidation("Invalid character 'a' instead of a digit", invalidSudoku4x4NonDigit, false)

    checkSudokuValidation("Valid Sudoku 4 x 4", validSudoku4x4, true)

    checkSudokuValidation("Invalid Sudoku 4 x 4", invalidSudoku4x4Row, false)
}
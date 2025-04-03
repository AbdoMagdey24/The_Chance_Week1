fun checkSudokuValidation(name: String, sudoku: List<List<Char>>, expected: Boolean) {
    val result = isValidSudoku(sudoku)
    if (result == expected) {
        println("success - $name")
    } else {
        println("failed - ($name)... it should return $expected but it returns: $result")
    }
}

fun main() {

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
    checkSudokuValidation("Valid Sudoku", validSudoku, true)

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
    checkSudokuValidation("Sudoku with duplicate in row", invalidSudokuRow, false)


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
    checkSudokuValidation("Sudoku with duplicate in column", invalidSudokuColumn, false)


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
    checkSudokuValidation("Sudoku with duplicate in box", invalidSudokuBox, false)

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
    checkSudokuValidation("Sudoku with invalid characters", invalidChars, false)


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
    checkSudokuValidation("Non 9x9 Sudoku grid", invalidSize, false)
}
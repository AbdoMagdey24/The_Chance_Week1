fun check(name: String, result: Boolean, correct: Boolean) {
    if (result == correct) {
        println("success - $name")
    } else {
        println("failed - ($name)...  , it should return $correct but it returns: $result")
    }
}

fun returnTrueIfRowHasNoDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return true if row has no duplicate",
        result = isValidRow(sudoku),
        correct = true
    )
}

fun returnTrueIfColumnHasNoDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return true if column has no duplicate",
        result = isValidColumn(sudoku),
        correct = true
    )
}

fun returnTrueIfBoxHasNoDuplicate(sudoku: List<List<Char>>) {
    check(
        name = "return true if box has no duplicate",
        result = isValidBox(sudoku),
        correct = true
    )
}

fun returnTrueForValidSudoku(sudoku: List<List<Char>>) {
    check(
        name = "return true if sudoku has no duplicate",
        result = isValidSudoku(sudoku),
        correct = true
    )
}

fun returnTrueIfSudokuIsEmpty(sudoku: List<List<Char>>) {
    check(
        name = "return true if sudoku is empty",
        result = isSudokuEmpty(sudoku),
        correct = true
    )
}

fun returnTrueForValidChars(sudoku: List<List<Char>>) {
    check(
        name = "return true if sudoku with valid chars",
        result = isValidCharacters(sudoku),
        correct = true
    )
}

fun returnTrueIfSudokuIsNotNxN(sudoku: List<List<Char>>) {
    check(
        name = "return true if sudoku isn't n x n",
        result = isSudokuNxNSize(sudoku),
        correct = true
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

val invalidSudokuBox = listOf(
    listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
    listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
    listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7', '8') //  Duplicate 8 in 3x3 box
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
    listOf('5', '-', '-', '-', '8', '-', '-', '7', '9') //  Duplicate 5 in column
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
    listOf('-', '-', '-', '-', '8', '-', '-', '7', '7') //  Duplicate 7 in row
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
    listOf('-', '9',  '-', '-', '-', '-', '6', '-'),
    listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
    listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
    listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
    listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
    listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
    listOf('-', '-', '-', '-', '8', '-', '-', '7')
)


fun main() {
    returnTrueForValidSudoku(validSudoku)
    returnTrueIfRowHasNoDuplicate(invalidSudokuRow)
    returnTrueIfColumnHasNoDuplicate(invalidSudokuColumn)
    returnTrueIfBoxHasNoDuplicate(invalidSudokuBox)
    returnTrueForValidChars(invalidChars)
    returnTrueIfSudokuIsEmpty(listOf())
    returnTrueIfSudokuIsEmpty(listOf(listOf()))
    returnTrueIfSudokuIsNotNxN(invalidSize)
}
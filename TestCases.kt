fun isValidSudoku(sudoku: List<List<Char>>): Boolean {
    // return checkRows(sudoku) && checkColumns(sudoku) && checkBoxes(sudoku)
    return false
}

fun isValidRow(sudoku: List<List<Char>>): Boolean {
    return false
}

fun isValidColumn(sudoku: List<List<Char>>): Boolean {
    return false
}

fun isValidBox(sudoku: List<List<Char>>): Boolean {
    return false
}

fun isValidCharacters(sudoku: List<List<Char>>): Boolean {
//    return sudoku.all { row ->
//        row.all { it.isDigit() && it in '1'..'9' || it == '.' }
//    }
    return false
}

fun isSudokuEmpty(sudoku: List<List<Char>>): Boolean {
//    return sudoku.isEmpty() || sudoku.all { it.isEmpty() }
    return false
}

fun isSudokuNxNSize(sudoku: List<List<Char>>): Boolean {
    return false
}

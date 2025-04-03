fun isValidSudoku(sudoku: List<List<Char>>): Boolean {
    if (sudoku.isEmpty() || sudoku.any { it.isEmpty() } || sudoku.any { it.size != sudoku[0].size }) {
        return false
    }

    val n = sudoku.size
    val sqrtN = Math.sqrt(n.toDouble()).toInt()
    if (sqrtN * sqrtN != n) {
        return false
    }

    val columnHashSets = Array(n) { HashSet<Int>() }
    val rowHashSets = Array(n) { HashSet<Int>() }
    val subMatrixHashSets = Array(sqrtN) { Array(sqrtN) { HashSet<Int>() } }

    for (i in 0 until n) {
        for (j in 0 until n) {
            val cell = sudoku[i][j]

            if (cell != '-' && (!cell.isDigit() || cell < '1' || cell > '9')) {
                return false
            }

            if (cell == '-') continue

            val value = Character.getNumericValue(cell)

            if (value in columnHashSets[j]) return false
            columnHashSets[j].add(value)

            if (value in rowHashSets[i]) return false
            rowHashSets[i].add(value)

            if (value in subMatrixHashSets[i / sqrtN][j / sqrtN]) return false
            subMatrixHashSets[i / sqrtN][j / sqrtN].add(value)
        }
    }

    return true
}

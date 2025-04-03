fun isValidSudoku(board: List<List<Char>>): Boolean {
    // Check if the board is empty or contains rows with different lengths
    if (board.isEmpty() || board.any { it.isEmpty() } || board.any { it.size != board[0].size }) {
        return false
    }

    val n = board.size

    // Check if the board size is a perfect square
    val sqrtN = Math.sqrt(n.toDouble()).toInt()
    if (sqrtN * sqrtN != n) {
        return false
    }

    // Initialize hash sets for columns, rows, and subgrids (3x3)
    val columnHashSets = Array(n) { HashSet<Int>() }
    val rowHashSets = Array(n) { HashSet<Int>() }
    val subMatrixHashSets = Array(sqrtN) { Array(sqrtN) { HashSet<Int>() } }

    for (i in 0 until n) {
        for (j in 0 until n) {
            val cell = board[i][j]

            // Reject non-digit characters or invalid characters
            if (cell != '-' && (!cell.isDigit() || cell < '1' || cell > '9')) {
                return false
            }

            if (cell == '-') continue  // Ignore empty cells

            val value = Character.getNumericValue(cell)

            // Check column
            if (value in columnHashSets[j]) return false
            columnHashSets[j].add(value)

            // Check row
            if (value in rowHashSets[i]) return false
            rowHashSets[i].add(value)

            // Check subgrid (3x3)
            if (value in subMatrixHashSets[i / sqrtN][j / sqrtN]) return false
            subMatrixHashSets[i / sqrtN][j / sqrtN].add(value)
        }
    }

    return true
}

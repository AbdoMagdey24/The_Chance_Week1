fun isValidIp(ip: String): Boolean {
    if (!ip.contains(".")) return false

    val segments = ip.split(".")

    if (segments.size != 4) return false

    for (segment in segments) {
        if (segment.isEmpty() || !segment.all { it.isDigit() }) return false

        val num = segment.toIntOrNull() ?: return false

        if (num !in 0..255) return false

        if ( segment.length > 1 && segment.startsWith("0") ) return false
    }

    return true
}
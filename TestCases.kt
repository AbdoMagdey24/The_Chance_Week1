fun check(name: String, result: Boolean, correct: Boolean, input: String) {
    if (result == correct) {
        println("success - $name for input: $input")
    } else {
        println("failed - ($name)... it should return $correct but it returns: $result for input: $input")
    }
}

fun returnTrueWhenIpIsValid(ip: String) {
    check(
        name = "Return True When Ip Is Valid",
        result = isValidIp(ip),
        correct = true,
        input = ip
    )
}

fun returnFalseWhenIpIsInvalid(ip: String) {
    check(
        name = "Return False When Ip Isn't Valid",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasBigSegment() {
    val ip = "256.100.50.25"
    check(
        name = "Return False When Ip has big segment",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasLeadingZero() {
    val ip = "192.168.01.1"
    check(
        name = "Return False When Ip has leading zero",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasInvalidSegmentCount() {
    val ip = "192.168.1"
    check(
        name = "Return False When Ip has invalid segment count",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasMoreThanFourSegments() {
    val ip = "192.168.1.1.1"
    check(
        name = "Return False When Ip has more than four segments",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasCommasInsteadOfDots() {
    val ip = "192,168,1,1"
    check(
        name = "Return False When Ip has commas instead of dots",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasDoubleDots() {
    val ip = "1..1"
    check(
        name = "Return False When Ip has double dots",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasLeadingDot() {
    val ip = ".1.1.1.1"
    check(
        name = "Return False When Ip has leading dot",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasAlphabets() {
    val ip = "192.1x1.1.1"
    check(
        name = "Return False When Ip has alphabets",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasNegativeNumbers() {
    val ip = "-1.2.3.4"
    check(
        name = "Return False When Ip has negative numbers",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasSpaceBetweenSegments() {
    val ip = "192. 168.1.1"
    check(
        name = "Return False When Ip has space between segments",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun returnFalseWhenIpHasZeroPrefix() {
    val ip = "00.0.0.0"
    check(
        name = "Return False When Ip has zero prefix",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
}

fun main() {
    returnFalseWhenIpHasBigSegment()
    returnFalseWhenIpHasLeadingZero()
    returnFalseWhenIpHasInvalidSegmentCount()
    returnFalseWhenIpHasMoreThanFourSegments()
    returnFalseWhenIpHasCommasInsteadOfDots()
    returnFalseWhenIpHasDoubleDots()
    returnFalseWhenIpHasLeadingDot()
    returnFalseWhenIpHasAlphabets()
    returnFalseWhenIpHasNegativeNumbers()
    returnFalseWhenIpHasSpaceBetweenSegments()
    returnFalseWhenIpHasZeroPrefix()

    returnTrueWhenIpIsValid("192.168.1.1")
    returnTrueWhenIpIsValid("8.8.8.8")
    returnTrueWhenIpIsValid("1.2.3.4")
    returnTrueWhenIpIsValid("172.16.254.1")

    returnFalseWhenIpIsInvalid("1000.16.254.10")
}

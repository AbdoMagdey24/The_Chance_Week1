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

fun main() {
    returnTrueWhenIpIsValid("192.168.1.1")
    returnTrueWhenIpIsValid("8.8.8.8")
    returnTrueWhenIpIsValid("1.2.3.4")
    returnTrueWhenIpIsValid("172.16.254.1")

    returnFalseWhenIpIsInvalid("256.100.50.25")
    returnFalseWhenIpIsInvalid("192.168.01.1")
    returnFalseWhenIpIsInvalid("192.168.1")
    returnFalseWhenIpIsInvalid("192.168.1.1.1")
    returnFalseWhenIpIsInvalid("192,168,1,1")
    returnFalseWhenIpIsInvalid("1..1")
    returnFalseWhenIpIsInvalid(".1.1.1.1")
    returnFalseWhenIpIsInvalid("192.1x1.1.1")
    returnFalseWhenIpIsInvalid("-1.2.3.4")
    returnFalseWhenIpIsInvalid("192. 168.1.1")
    returnFalseWhenIpIsInvalid("00.0.0.0")
}

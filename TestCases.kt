fun check(name: String, result: Boolean, correct: Boolean, input: String) {
    if (result == correct) {
        println("success - $name for input: $input")
    } else {
        println("failed - ($name)... it should return $correct but it returns: $result for input: $input")
    }
}

fun main() {
    var ip = "192.168.1.1"
    check(
        name = "Should Return True When Ip Is Valid",
        result = isValidIp(ip),
        correct = true,
        input = ip
    )

    ip = "256.100.50.25"
    check(
        name = "Should Return False When Ip has out of range",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "192.168.01.1"
    check(
        name = "Should Return False When Ip has leading zero",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "192.168.1"
    check(
        name = "Should Return False When Ip is missing segments",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "192.168.1.1.1"
    check(
        name = "Should Return False When Ip has more than four segments",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "192,168,1,1"
    check(
        name = "Should Return False When Ip has commas instead of dots",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "1..1"
    check(
        name = "Should Return False When Ip has double dots",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = ".1.1.1.1"
    check(
        name = "Should Return False When Ip has leading dot",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )
    ip = "192.1x1.1.1"
    check(
        name = "Should Return False When Ip has alphabets",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "192. 168.1.1"
    check(
        name = "Should Return False When Ip has space between segments",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

    ip = "1000. 01.255.ab.1"
    check(
        name = "Should Return False When Ip Isn't Valid",
        result = isValidIp(ip),
        correct = false,
        input = ip
    )

}

fun checkIpValidation(name: String, ip: String, expected: Boolean) {
    val result = isValidIp(ip)
    if (result == expected) {
        println("success - $name for input: $ip")
    } else {
        println("failed - ($name)... it should return $expected but it returns: $result for input: $ip")
    }
}

fun main() {

    checkIpValidation("Valid", "192.168.1.1", true)
    checkIpValidation("Valid", "8.8.8.8", true)
    checkIpValidation("Valid", "1.2.3.4", true)
    checkIpValidation("Valid", "172.16.254.1", true)


    checkIpValidation("Invalid", "256.100.50.25", false)
    checkIpValidation("Invalid", "192.168.01.1", false)
    checkIpValidation("Invalid", "192.168.1", false)
    checkIpValidation("Invalid", "192.168.1.1.1", false)
    checkIpValidation("Invalid", "192,168,1,1", false)
    checkIpValidation("Invalid", "1..1", false)
    checkIpValidation("Invalid", ".1.1.1.1", false)
    checkIpValidation("Invalid", "192.1x1.1.1", false)
    checkIpValidation("Invalid", "-1.2.3.4", false)
    checkIpValidation("Invalid", "192. 168.1.1", false)
    checkIpValidation("Invalid", "00.0.0.0", false)
}

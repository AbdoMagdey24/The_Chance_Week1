fun check(name: String, result: Boolean, correct: Boolean) {
    if (result == correct) {
        println("success - $name")
    } else {
        println("failed - ($name).... , it should return $correct but it returns: $result")
    }
}

fun returnTrueIfAnySegmentIsBig(segment: Int) {
    check(
        name = "Return True If Any Segment Is Big",
        result = isSegmentBig(segment),
        correct = true
    )
}

fun returnTrueIfAnySegmentIsSmall(segment: Int) {
    check(
        name = "Return true If Any Segment Is Small",
        result = isSegmentSmall(segment),
        correct = true
    )
}

fun returnTrueIfIpHasMoreSegments(size: Int) {
    check(
        name = "Return True If Ip Has More Segments",
        result = isOverlimitSegmets(size),
        correct = true
    )
}

fun returnTrueIfIpHasLessSegments(size: Int) {
    check(
        name = "Return True If Ip Has Less Segments",
        result = isUnderlimitSegmets(size),
        correct = true
    )
}

fun returnTrueIfSegmentIsNotDigits(segment: String) {
    check(
        name = "Return True If Segment Is Not Digits",
        result = isValidSegmentFormat(segment),
        correct = true
    )
}

fun returnTrueIfIpDoesNotContainDot() {
    val ip = "19216811"
    check(
        name = "Return True If Ip Doesn't Contain Dot",
        result = containsDot(ip),
        correct = true
    )
}

fun returnTrueIfLeadingZero(ip: String) {
    check(
        name = "Return True If Any Segment Has Leading Zero",
        result = isLeadingZero(ip),
        correct = true
    )
}

fun returnTrueWhenIpIsValid(ip: String) {
    check(
        name = "Return True When Ip Is Valid",
        result = isValidIp(ip),
        correct = true
    )
}

fun returnTrueWhenIpIsInvalid(ip: String) {
    check(
        name = "Return True When Ip Is Valid",
        result = isValidIp(ip),
        correct = true
    )
}

fun main() {
    returnTrueIfAnySegmentIsBig(256)

    returnTrueIfAnySegmentIsSmall(-1)

    returnTrueIfIpHasMoreSegments(5)

    returnTrueIfIpHasLessSegments(3)

    returnTrueIfSegmentIsNotDigits("one")

    returnTrueIfIpDoesNotContainDot()

    returnTrueIfLeadingZero("01")

    returnTrueWhenIpIsValid("192.168.1.1")
    returnTrueWhenIpIsValid("8.8.8.8")
    returnTrueWhenIpIsValid("1.2.3.4")
    returnTrueWhenIpIsValid("172.16.254.1")

    returnTrueWhenIpIsInvalid("256.100.50.25")
    returnTrueWhenIpIsInvalid("192.168.01.1")
    returnTrueWhenIpIsInvalid("192.168.1")
    returnTrueWhenIpIsInvalid("192.168.1.1.1")
    returnTrueWhenIpIsInvalid("192,168,1,1")
}
//NO_CHECK_LAMBDA_INLINING
import test.*

fun test1(param: String): String {
    var result = "fail1"
    noInlineFun(param) { a ->
        concat("start") {
            result = doSmth(a).toString()
        }
    }

    return result
}

fun test11(param: String): String {
    var result = "fail1"
    noInlineFun("stub") { a ->
        concat("start") {
            result = doSmth(param).toString()
        }
    }

    return result
}

inline fun test2(crossinline param: () -> String): String {
    var result = "fail1"
    noInlineFun("stub") { a ->
        concat(param()) {
            result = doSmth(param()).toString()
        }
    }

    return result
}

inline fun test22(crossinline param: () -> String): String {
    var result = "fail1"
    {{result = param()}()}()

    return result
}


fun box(): String {
    if (test1("start") != "start") return "fail1: ${test1("start")}"
    if (test1("nostart") != "nostart") return "fail2: ${test1("nostart")}"
    if (test11("start") != "start") return "fail3: ${test11("start")}"

    if (test2({"start"}) != "start") return "fail4: ${test2({"start"})}"
    if (test22({"start"}) != "start") return "fail5: ${test22({"start"})}"

    return "OK"
}
package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

enum class Foo {
    BAR;
    fun foo(import: String) {
    assertEquals("123", import)
    testRenamed("import", { import })
}

    fun test() {
        foo("123")
    }
}

fun box(): String {
    Foo.BAR.test()

    return "OK"
}
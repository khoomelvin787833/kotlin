// !DIAGNOSTICS: -UNUSED_PARAMETER

infix fun Any?.foo(a: Any) {}
operator fun Any?.contains(a: Any): Boolean = true

fun test(a: Any) {

    a foo""
    a foo"asd"
    a foo"$a"
    a foo"asd${a}sfsa"
    a foo"""sdf"""
    a foo'd'
    a foo''

    a foo""foo a
    a foo"asd"foo a
    a foo"$a"foo a
    a foo"asd${a}sfsa"foo a
    a foo"""sdf"""foo a
    a foo'd'foo a
    a foo''foo a

    a in"foo"
    a in"""foo"""
    a in's'
    a in''

    a !in"foo"
    a !in"""foo"""
    a !in's'
    a !in''

    if("s"is Any) {}
    if("s"is Any) {}
    test("s"as Any)

    a foo""<!SYNTAX!>1<!>
    a foo""<!SYNTAX!>1.0<!>
}
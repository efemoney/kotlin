open class A() {
    fun foo() {
        if (this is B) {
            bar()
        }
    }
}

class B() : A() {
    fun bar() {}
}

fun f9(a : A?) {
    a?.foo()
    a?.<!UNRESOLVED_REFERENCE!>bar<!>()
    if (a is B) {
        a.bar()
        a.foo()
    }
    a?.foo()
    a?.<!UNRESOLVED_REFERENCE!>bar<!>()
    if (!(a is B)) {
        a?.<!UNRESOLVED_REFERENCE!>bar<!>()
        a?.foo()
    }
    if (!(a is B) || a.bar() == Unit) {
        a?.<!UNRESOLVED_REFERENCE!>bar<!>()
    }
    if (!(a is B)) {
        return;
    }
    a.bar()
    a.foo()
}

fun fAny(a : Any?) {
    if (a is B) {
        a.bar()
        a.foo()
    }
    if (!(a is B)) {
        return;
    }
    a.bar()
    a.foo()
}

fun f10(a : A?) {
    if (!(a is B)) {
        return;
    }
    if (!(a is B)) {
        return;
    }
}

class C() : A() {
    fun bar() {

    }
}

fun f101(a : A?) {
    if (a is C) {
        a.bar();
    }
}

fun f11(a : A?) {
    when (a) {
        is B -> a.bar()
            is A -> a.foo()
            is Any -> a.foo()
    is Any? -> a.<!UNRESOLVED_REFERENCE!>bar<!>()
        else -> a?.foo()
    }
}

fun f12(a : A?) {
    when (a) {
        is B -> a.bar()
            is A -> a.foo()
            is Any -> a.foo();
            is Any? -> a.<!UNRESOLVED_REFERENCE!>bar<!>()
        is C -> a.bar()
        else -> a?.foo()
    }

    if (a is Any?) {
        a?.<!UNRESOLVED_REFERENCE!>bar<!>()
    }
    if (a is B) {
        a.bar()
    }
}

fun f13(a : A?) {
    if (a is B) {
        a.foo()
        a.bar()
    }
    else {
        a?.foo()
        <!UNRESOLVED_REFERENCE!>bar<!>()
    }

    a?.foo()
    if (!(a is B)) {
        a?.foo()
    }
    else {
        a.foo()
    }

    a?.foo()
    if (a is B && a.foo() == Unit) {
        a.foo()
        a.bar()
    }
    else {
        a?.foo()
    }

    if (!(a is B) || !(a is C)) {
    }
    else {
    }

    if (!(a is B) || !(a is C)) {
    }

    if (!(a is B)) return
    a.<!AMBIGUITY!>bar<!>()
}

fun f14(a : A?) {
    while (!(a is B)) {
    }
    a.<!UNRESOLVED_REFERENCE!>bar<!>()
}
fun f15(a : A?) {
    do {
    } while (!(a is B))
    a.<!UNRESOLVED_REFERENCE!>bar<!>()
}

fun getStringLength(obj : Any) : Char? {
    if (obj !is String)
        return null
    return obj.get(0) // no cast to kotlin.String is needed
}

fun toInt(i: Int?): Int = if (i != null) i else 0
fun illegalWhenBody(a: Any): Int = when(a) {
    is Int -> a
            is String -> a
    else -> 1
}
fun illegalWhenBlock(a: Any): Int {
    when(a) {
        is Int -> return a
            is String -> return a
        else -> return 1
    }
}
fun declarations(a: Any?) {
    if (a is String) {
        val p4: String = a
    }
    if (a is String?) {
        if (a != null) {
            val s: String = a
        }
    }
    if (a != null) {
        if (a is String?) {
            val s: String = a
        }
    }
}
fun vars(a: Any?) {
    var b: Int = 0
    if (a is Int) {
        b = a
    }
}
fun returnFunctionLiteralBlock(a: Any?): Function0<Int> {
    if (a is Int) return { a }
    else return { 1 }
}
fun returnFunctionLiteral(a: Any?): Function0<Int> =
    if (a is Int) (fun (): Int = a)
else { -> 1 }

fun mergeSmartCasts(a: Any?) {
    if (a is String || a is Int) {
        a.<!INAPPLICABLE_CANDIDATE!>compareTo<!>("")
        a.toString()
    }
    if (a is Int || a is String) {
        a.<!INAPPLICABLE_CANDIDATE!>compareTo<!>("")
    }
    when (a) {
        is String, is Any -> a.<!UNRESOLVED_REFERENCE!>compareTo<!>("")
    }
    if (a is String && a is Any) {
        val i: Int = a.compareTo("")
    }
    if (a is String && a.compareTo("") == 0) {}
    if (a is String || a.== 0) {}
}

//mutability
fun f(): String {
    var a: Any = 11
    if (a is String) {
        val i: String = a
        a.compareTo("f")
        val f: Function0<String> = {
        a = 42
        a
    }
        return a
    }
    return ""
}

class Mutable(var x: String?) {

    val xx: String?
    get() = x

    fun foo(): String {
        if (x is String) {
            return x
        }
        if (x != null) {
            return x
        }
        if (xx is String) {
            return xx
        }
        return ""
    }

    fun bar(other: Mutable): String {
        var y = other
        if (y.x is String) {
            return y.x
        }
        return ""
    }
}

fun foo(aa: Any): Int {
    var a = aa
    if (a is Int) {
        return a
    }
    return 1
}

fun inForLoop(x: Any?) {
    if (x is Array<*>) {
        for (i in x) {}
    }
    <!UNRESOLVED_REFERENCE, UNRESOLVED_REFERENCE, UNRESOLVED_REFERENCE!>for (i in x) {}<!>
}

class ExplicitAccessorForAnnotation {
    val tt: String? = "good"
    get

    fun foo(): String {
        if (tt is String) {
            return tt
        }
        return ""
    }
}
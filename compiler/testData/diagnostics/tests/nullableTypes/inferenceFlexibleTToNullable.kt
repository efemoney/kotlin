// !DIAGNOSTICS: -UNUSED_VARIABLE
// !LANGUAGE: +NewInference
// SKIP_TXT

// FILE: Foo.java
import org.jetbrains.annotations.NotNull;

public class Foo<T>  {
    T x;

    public Foo(T x) {
        this.x = x;
    }

    public Integer bar() { return null; }

    public static <K> K simpleId(K k) {
        return k;
    }

    public T produceT() {
        return x;
    }

    @NotNull
    public T produceNotNullT() {
        return x;
    }

    public void consumeT(T x) {}
}

// FILE: main.kt
fun bar(n: Number?) {
    val a: Number = <!TYPE_MISMATCH!>Foo.<!TYPE_MISMATCH!>simpleId(n)<!><!>
    val b: Number? = Foo.simpleId(n)
    val c = <!DEBUG_INFO_EXPRESSION_TYPE("kotlin.Number?")!>Foo.simpleId(n)<!>

    val x = Foo(if (true) 10 else null)
    val y1: Number = <!TYPE_MISMATCH!>x.produceT()<!>
    val y2: Number? = x.produceT()
    val y3 = <!DEBUG_INFO_EXPRESSION_TYPE("kotlin.Int?")!>x.produceT()<!>
    val y4 = <!DEBUG_INFO_EXPRESSION_TYPE("kotlin.Int")!>x.produceNotNullT()<!>

    x.consumeT(y3)
}
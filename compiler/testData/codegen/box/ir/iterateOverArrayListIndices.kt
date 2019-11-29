// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

fun box(): String {
    val a = ArrayList<String>()
    a.add("OK")
    for (i in a.indices) {
        return a[i]
    }
    return "Fail"
}

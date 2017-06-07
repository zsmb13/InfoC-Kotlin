package util

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

inline fun captureStdOut(block: () -> Unit): Sequence<String> {
    val outStream = ByteArrayOutputStream()
    System.setOut(PrintStream(outStream))
    block()
    System.setOut(null)
    return outStream.toString().lineSequence()
}

inline fun captureLastLine(block: () -> Unit) = captureStdOut(block).filter { it.isNotBlank() }.last()

inline fun withStdIn(input: String, block: () -> Unit) {
    val inStream = ByteArrayInputStream(input.toByteArray())
    System.setIn(inStream)
    block()
    System.setIn(null)
}

inline fun withStdIn(input: Any, block: () -> Unit) = withStdIn(input.toString(), block)

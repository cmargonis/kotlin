@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("SequencesKt")
@file:kotlin.jvm.JvmVersion

package kotlin.sequences

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.*
import kotlin.text.*
import kotlin.comparisons.*
import kotlin.coroutines.experimental.*

/**
 * Returns a sequence containing all elements that are instances of specified class.
 *
 * The operation is _intermediate_ and _stateless_.
 */
public fun <R> Sequence<*>.filterIsInstance(klass: Class<R>): Sequence<R> {
    @Suppress("UNCHECKED_CAST")
    return filter { klass.isInstance(it) } as Sequence<R>
}

/**
 * Appends all elements that are instances of specified class to the given [destination].
 *
 * The operation is _terminal_.
 */
public fun <C : MutableCollection<in R>, R> Sequence<*>.filterIsInstanceTo(destination: C, klass: Class<R>): C {
    @Suppress("UNCHECKED_CAST")
    for (element in this) if (klass.isInstance(element)) destination.add(element as R)
    return destination
}

/**
 * Returns a [SortedSet][java.util.SortedSet] of all elements.
 *
 * The operation is _terminal_.
 */
public fun <T : Comparable<T>> Sequence<T>.toSortedSet(): java.util.SortedSet<T> {
    return toCollection(java.util.TreeSet<T>())
}

/**
 * Returns a [SortedSet][java.util.SortedSet] of all elements.
 * 
 * Elements in the set returned are sorted according to the given [comparator].
 *
 * The operation is _terminal_.
 */
public fun <T> Sequence<T>.toSortedSet(comparator: Comparator<in T>): java.util.SortedSet<T> {
    return toCollection(java.util.TreeSet<T>(comparator))
}


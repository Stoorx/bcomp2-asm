package io.stoorx.bcomp2asm

import io.stoorx.bcomp2asm.statements.Statement

open class StatementList {
    fun append(statement: Statement) = _statements.add(statement)
    val statements: List<Statement>
        get() = _statements

    private val _statements: MutableList<Statement> = ArrayList()
}
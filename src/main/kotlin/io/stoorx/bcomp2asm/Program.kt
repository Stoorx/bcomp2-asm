package io.stoorx.bcomp2asm

import io.stoorx.bcomp2asm.statements.Statement

class Program {
    fun asm(statements: Program.() -> Unit) = apply(statements)
    fun append(statement: Statement) = _statements.add(statement)
    fun compile(compiler: Compiler) = compiler.compile(this)

    val statements: List<Statement>
        get() = _statements

    private val _statements: MutableList<Statement> = ArrayList()
}
package io.stoorx.bcomp2asm

import io.stoorx.bcomp2asm.compilers.Compiler

class Program : StatementList() {
    fun asm(statements: Program.() -> Unit) = apply(statements)
    fun compile(compiler: Compiler) = compiler.compile(this)
}
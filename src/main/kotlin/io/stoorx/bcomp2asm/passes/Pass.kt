package io.stoorx.bcomp2asm.passes

import io.stoorx.bcomp2asm.statements.Statement

abstract class Pass {
    fun process(stmt: Statement): Unit = TODO("not implemented")
}
package io.stoorx.bcomp2asm.passes

import io.stoorx.bcomp2asm.Program
import io.stoorx.bcomp2asm.statements.Statement

interface Pass {
    fun run(program: Program)

    fun process(statement: Statement)
}
package io.stoorx.bcomp2asm.passes

import io.stoorx.bcomp2asm.Program
import io.stoorx.bcomp2asm.statements.Statement

abstract class Pass {
    abstract fun run(program: Program)

    abstract fun process(statement: Statement)
}
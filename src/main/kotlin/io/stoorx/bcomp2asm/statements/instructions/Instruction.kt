package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.passes.Pass
import io.stoorx.bcomp2asm.statements.Statement

abstract class Instruction : Statement() {
    override fun process(pass: Pass) {
        TODO()
    }
}
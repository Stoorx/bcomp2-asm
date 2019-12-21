package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.passes.Pass
import io.stoorx.bcomp2asm.statements.Statement

@ExperimentalUnsignedTypes
abstract class Instruction : Statement() {
    abstract val size: Int
    abstract val opcode: Int

    var address: ULong? = null

    override fun process(pass: Pass) = pass.process(this)
}
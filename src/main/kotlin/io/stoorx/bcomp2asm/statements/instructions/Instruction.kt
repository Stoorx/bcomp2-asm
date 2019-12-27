package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.passes.Pass
import io.stoorx.bcomp2asm.statements.Statement

@ExperimentalUnsignedTypes
abstract class Instruction : Statement {
    abstract val size: UInt
    abstract val opcode: UInt

    override fun process(pass: Pass) = pass.process(this)
}
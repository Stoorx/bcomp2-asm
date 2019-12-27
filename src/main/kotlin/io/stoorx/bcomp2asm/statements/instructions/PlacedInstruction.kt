@file:Suppress("EXPERIMENTAL_API_USAGE", "EXPERIMENTAL_OVERRIDE")

package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.passes.Pass

class PlacedInstruction(
    val instruction: Instruction,
    val address: UInt
) : Instruction() {
    override val size: UInt
        get() = instruction.size
    override val opcode: UInt
        get() = instruction.opcode

    override fun process(pass: Pass) = pass.process(this)
    override val name: String
        get() = instruction.name
}
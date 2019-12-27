@file:Suppress("EXPERIMENTAL_API_USAGE", "EXPERIMENTAL_OVERRIDE", "EXPERIMENTAL_UNSIGNED_LITERALS")

package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.Program


class Nop : Instruction() {
    override val size: UInt
        get() = 2u
    override val opcode: UInt
        get() = 0u
    override val name: String
        get() = "nop"
}

fun Program.nop() = append(Nop())
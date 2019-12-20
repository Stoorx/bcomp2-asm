@file:Suppress("EXPERIMENTAL_API_USAGE", "EXPERIMENTAL_OVERRIDE")

package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.Program


class Nop : Instruction() {
    override val size: Int
        get() = 2

    // TODO: implement
}

fun Program.nop() = append(Nop())
package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.Program

class Nop : Instruction() {
    // TODO: implement
}

fun Program.nop() = append(Nop())
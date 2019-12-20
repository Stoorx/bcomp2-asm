package io.stoorx.bcomp2asm

import io.stoorx.bcomp2asm.compilers.BinaryCompiler
import io.stoorx.bcomp2asm.statements.instructions.nop

fun main() {
    Program()
        .asm {
            nop()
        }
        .compile(
            BinaryCompiler()
        )
}
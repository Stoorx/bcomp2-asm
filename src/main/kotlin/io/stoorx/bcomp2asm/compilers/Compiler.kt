package io.stoorx.bcomp2asm.compilers

import io.stoorx.bcomp2asm.Program

interface Compiler {
    fun compile(program: Program)
}

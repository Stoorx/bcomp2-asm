package io.stoorx.bcomp2asm.compilers

import io.stoorx.bcomp2asm.Program
import io.stoorx.bcomp2asm.passes.AddressSetPass
import io.stoorx.bcomp2asm.passes.Pass

class BinaryCompiler : Compiler {
    override fun compile(program: Program) {
        listOf<Pass>(
            AddressSetPass()
        ).fold(Context(program)) { context: Context, pass: Pass ->
            pass.run(context)
        }
    }
}
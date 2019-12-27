@file:Suppress("EXPERIMENTAL_API_USAGE")

package io.stoorx.bcomp2asm.passes

import io.stoorx.bcomp2asm.compilers.Context
import io.stoorx.bcomp2asm.statements.Statement
import io.stoorx.bcomp2asm.statements.instructions.Instruction

interface Pass {
    fun run(context: Context): Context
    fun process(statement: Statement): Unit = error("""Unknown statement "${statement.name}"""")
    fun process(instruction: Instruction): Unit
}
@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS", "EXPERIMENTAL_API_USAGE")

package io.stoorx.bcomp2asm.passes

import io.stoorx.bcomp2asm.StatementList
import io.stoorx.bcomp2asm.compilers.Context
import io.stoorx.bcomp2asm.statements.instructions.Instruction
import io.stoorx.bcomp2asm.statements.instructions.PlacedInstruction

class AddressSetPass : Pass {
    private var currentAddress: UInt = 0u
    private val statementList = StatementList()

    override fun run(context: Context): Context {
        context.statementList.statements.forEach { it.process(this) }
        return Context(statementList)
    }

    override fun process(instruction: Instruction): Unit =
        statementList.append(PlacedInstruction(instruction, currentAddress))
            .run { currentAddress += instruction.size }

}
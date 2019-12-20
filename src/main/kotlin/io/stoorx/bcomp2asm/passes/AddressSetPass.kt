package io.stoorx.bcomp2asm.passes

import io.stoorx.bcomp2asm.Program
import io.stoorx.bcomp2asm.statements.Statement

@ExperimentalUnsignedTypes
class AddressSetPass : Pass() {
    override fun run(program: Program) {
        program.statements.fold(AddressSetPassState()) { state, statement ->
            statement.process(this)
            state // TODO: Replace
        }

    }

    override fun process(statement: Statement) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

private data class AddressSetPassState @ExperimentalUnsignedTypes constructor(
    val currentAddress: ULong = 0u
) {
    val statementsList: MutableList<Statement> = ArrayList()
}
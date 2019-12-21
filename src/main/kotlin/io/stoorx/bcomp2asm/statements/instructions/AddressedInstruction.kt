@file:Suppress("EXPERIMENTAL_API_USAGE", "EXPERIMENTAL_OVERRIDE")

package io.stoorx.bcomp2asm.statements.instructions

import io.stoorx.bcomp2asm.addressingModes.*
import io.stoorx.bcomp2asm.passes.Pass

abstract class AddressedInstruction : Instruction() {
    override fun process(pass: Pass) = pass.process(this)

    fun emit(direct: Direct): EmittedInstruction = TODO()
    fun emit(direct: Immediate): EmittedInstruction = TODO()
    fun emit(direct: Indirect): EmittedInstruction = TODO()
    fun emit(direct: PostIncrement): EmittedInstruction = TODO()
    fun emit(direct: PreDecrement): EmittedInstruction = TODO()
    fun emit(direct: Relative): EmittedInstruction = TODO()
    fun emit(direct: StackRelative): EmittedInstruction = TODO()
}
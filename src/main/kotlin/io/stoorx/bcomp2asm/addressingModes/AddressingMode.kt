package io.stoorx.bcomp2asm.addressingModes

import io.stoorx.bcomp2asm.statements.instructions.AddressedInstruction
import io.stoorx.bcomp2asm.statements.instructions.EmittedInstruction


interface AddressingMode {
    fun resolve(addressedInstruction: AddressedInstruction): EmittedInstruction
}



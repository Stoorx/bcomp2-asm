package io.stoorx.bcomp2asm.addressingModes

import io.stoorx.bcomp2asm.statements.instructions.AddressedInstruction
import io.stoorx.bcomp2asm.statements.instructions.EmittedInstruction

data class Immediate(val value: Short) : AddressingMode {
    override fun resolve(addressedInstruction: AddressedInstruction): EmittedInstruction =
        addressedInstruction.emit(this)
}
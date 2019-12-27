package io.stoorx.bcomp2asm.statements

import io.stoorx.bcomp2asm.passes.Pass

interface Statement {
    val name: String
    fun process(pass: Pass) = pass.process(this)
}
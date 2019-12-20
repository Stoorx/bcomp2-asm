package io.stoorx.bcomp2asm.statements

import io.stoorx.bcomp2asm.passes.Pass

abstract class Statement {
    open fun process(pass: Pass) = pass.process(this)
}
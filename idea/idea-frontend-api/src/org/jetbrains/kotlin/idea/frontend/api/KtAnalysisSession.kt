/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api

import org.jetbrains.kotlin.diagnostics.Diagnostic
import org.jetbrains.kotlin.idea.frontend.api.scopes.KtScopeProvider
import org.jetbrains.kotlin.idea.frontend.api.symbols.*
import org.jetbrains.kotlin.idea.frontend.api.types.KtType
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.*

abstract class KtAnalysisSession(override val token: ValidityToken) : ValidityTokenOwner {
    abstract val symbolProvider: KtSymbolProvider
    abstract val scopeProvider: KtScopeProvider

    abstract fun getSmartCastedToTypes(expression: KtExpression): Collection<KtType>?

    abstract fun getImplicitReceiverSmartCasts(expression: KtExpression): Collection<ImplicitReceiverSmartCast>

    abstract fun getReturnTypeForKtDeclaration(declaration: KtDeclaration): KtType

    abstract fun getKtExpressionType(expression: KtExpression): KtType

    abstract fun isSubclassOf(klass: KtClassOrObject, superClassId: ClassId): Boolean

    abstract fun getDiagnosticsForElement(element: KtElement): Collection<Diagnostic>

    abstract fun resolveCall(call: KtCallExpression): CallInfo?
    abstract fun resolveCall(call: KtBinaryExpression): CallInfo?

    abstract fun createContextDependentCopy(): KtAnalysisSession
}

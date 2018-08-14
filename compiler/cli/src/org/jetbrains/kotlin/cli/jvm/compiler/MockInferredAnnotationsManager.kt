/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.cli.jvm.compiler

import com.intellij.codeInsight.InferredAnnotationsManager
import com.intellij.psi.PsiAnnotation
import com.intellij.psi.PsiModifierListOwner

class MockInferredAnnotationsManager : InferredAnnotationsManager() {
    override fun findInferredAnnotation(listOwner: PsiModifierListOwner, annotationFQN: String): PsiAnnotation? = null
    override fun ignoreInference(owner: PsiModifierListOwner, annotationFQN: String?): Boolean = true
    override fun findInferredAnnotations(listOwner: PsiModifierListOwner): Array<out PsiAnnotation> = EMPTY_PSI_ANNOTATION_ARRAY
    override fun isInferredAnnotation(annotation: PsiAnnotation): Boolean = false

    companion object {
        val EMPTY_PSI_ANNOTATION_ARRAY = arrayOf<PsiAnnotation>()
    }
}

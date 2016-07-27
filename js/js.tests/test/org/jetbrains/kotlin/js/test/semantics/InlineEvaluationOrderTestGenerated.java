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

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/inlineEvaluationOrder/cases")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class InlineEvaluationOrderTestGenerated extends AbstractInlineEvaluationOrderTest {
    public void testAllFilesPresentInCases() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/inlineEvaluationOrder/cases"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("argumentOfCall.kt")
    public void testArgumentOfCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/argumentOfCall.kt");
        doTest(fileName);
    }

    @TestMetadata("argumentOfCallMultipleInlineCalls.kt")
    public void testArgumentOfCallMultipleInlineCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/argumentOfCallMultipleInlineCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("argumentOfInlineCall.kt")
    public void testArgumentOfInlineCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/argumentOfInlineCall.kt");
        doTest(fileName);
    }

    @TestMetadata("argumentOfNew.kt")
    public void testArgumentOfNew() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/argumentOfNew.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAccess1.kt")
    public void testArrayAccess1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayAccess1.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAccess2.kt")
    public void testArrayAccess2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayAccess2.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAccess3.kt")
    public void testArrayAccess3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayAccess3.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayAccessLhsDecomposed.kt")
    public void testArrayAccessLhsDecomposed() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayAccessLhsDecomposed.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayLiteral.kt")
    public void testArrayLiteral() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayLiteral.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayLiteralMultipleInlineCalls.kt")
    public void testArrayLiteralMultipleInlineCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayLiteralMultipleInlineCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("arrayLiteralNested.kt")
    public void testArrayLiteralNested() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/arrayLiteralNested.kt");
        doTest(fileName);
    }

    @TestMetadata("assignment.kt")
    public void testAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/assignment.kt");
        doTest(fileName);
    }

    @TestMetadata("binaryOperator.kt")
    public void testBinaryOperator() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/binaryOperator.kt");
        doTest(fileName);
    }

    @TestMetadata("binaryOperatorMultipleInlineCalls.kt")
    public void testBinaryOperatorMultipleInlineCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/binaryOperatorMultipleInlineCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("callQualifier.kt")
    public void testCallQualifier() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/callQualifier.kt");
        doTest(fileName);
    }

    @TestMetadata("callQualifierComplex.kt")
    public void testCallQualifierComplex() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/callQualifierComplex.kt");
        doTest(fileName);
    }

    @TestMetadata("conditional.kt")
    public void testConditional() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/conditional.kt");
        doTest(fileName);
    }

    @TestMetadata("conditionalElvis.kt")
    public void testConditionalElvis() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/conditionalElvis.kt");
        doTest(fileName);
    }

    @TestMetadata("conditionalNested.kt")
    public void testConditionalNested() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/conditionalNested.kt");
        doTest(fileName);
    }

    @TestMetadata("conditionalTestExpression.kt")
    public void testConditionalTestExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/conditionalTestExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("conditionalTestExpressionElvis.kt")
    public void testConditionalTestExpressionElvis() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/conditionalTestExpressionElvis.kt");
        doTest(fileName);
    }

    @TestMetadata("continueInExtractedDoWhile.kt")
    public void testContinueInExtractedDoWhile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/continueInExtractedDoWhile.kt");
        doTest(fileName);
    }

    @TestMetadata("doWhile.kt")
    public void testDoWhile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/doWhile.kt");
        doTest(fileName);
    }

    @TestMetadata("doWhileComplex.kt")
    public void testDoWhileComplex() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/doWhileComplex.kt");
        doTest(fileName);
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/for.kt");
        doTest(fileName);
    }

    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/if.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineFunctionAsParameterOfQualifiedCall.kt")
    public void testInlineFunctionAsParameterOfQualifiedCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/inlineFunctionAsParameterOfQualifiedCall.kt");
        doTest(fileName);
    }

    @TestMetadata("lambdaPropertyExtracted.kt")
    public void testLambdaPropertyExtracted() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/lambdaPropertyExtracted.kt");
        doTest(fileName);
    }

    @TestMetadata("lambdaWithClosure.kt")
    public void testLambdaWithClosure() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/lambdaWithClosure.kt");
        doTest(fileName);
    }

    @TestMetadata("logicalAnd.kt")
    public void testLogicalAnd() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/logicalAnd.kt");
        doTest(fileName);
    }

    @TestMetadata("logicalAndOrMultipleInlineCalls.kt")
    public void testLogicalAndOrMultipleInlineCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/logicalAndOrMultipleInlineCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("logicalOr.kt")
    public void testLogicalOr() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/logicalOr.kt");
        doTest(fileName);
    }

    @TestMetadata("methodCallQualifierWithSideEffect.kt")
    public void testMethodCallQualifierWithSideEffect() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/methodCallQualifierWithSideEffect.kt");
        doTest(fileName);
    }

    @TestMetadata("methodDecomposedWithBind.kt")
    public void testMethodDecomposedWithBind() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/methodDecomposedWithBind.kt");
        doTest(fileName);
    }

    @TestMetadata("methodInlineCallQualifierWithSideEffect.kt")
    public void testMethodInlineCallQualifierWithSideEffect() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/methodInlineCallQualifierWithSideEffect.kt");
        doTest(fileName);
    }

    @TestMetadata("multiDeclaration.kt")
    public void testMultiDeclaration() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/multiDeclaration.kt");
        doTest(fileName);
    }

    @TestMetadata("multiDeclarationComplex.kt")
    public void testMultiDeclarationComplex() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/multiDeclarationComplex.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedContinueInExtractedDoWhile.kt")
    public void testNestedContinueInExtractedDoWhile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/nestedContinueInExtractedDoWhile.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedInlineCall.kt")
    public void testNestedInlineCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/nestedInlineCall.kt");
        doTest(fileName);
    }

    @TestMetadata("propertiesInitializationOrder.kt")
    public void testPropertiesInitializationOrder() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertiesInitializationOrder.kt");
        doTest(fileName);
    }

    @TestMetadata("propertiesInitializationOrderSimple.kt")
    public void testPropertiesInitializationOrderSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertiesInitializationOrderSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyAccessAfterModification.kt")
    public void testPropertyAccessAfterModification() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertyAccessAfterModification.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyAccessAndInitializer.kt")
    public void testPropertyAccessAndInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertyAccessAndInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyAccessWithSideEffect.kt")
    public void testPropertyAccessWithSideEffect() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertyAccessWithSideEffect.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyWithSideEffectExtracted.kt")
    public void testPropertyWithSideEffectExtracted() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertyWithSideEffectExtracted.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyWithSideEffectPassedToInlineFunction.kt")
    public void testPropertyWithSideEffectPassedToInlineFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/propertyWithSideEffectPassedToInlineFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("ternaryConditional.kt")
    public void testTernaryConditional() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/ternaryConditional.kt");
        doTest(fileName);
    }

    @TestMetadata("while.kt")
    public void testWhile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/while.kt");
        doTest(fileName);
    }

    @TestMetadata("whileComplex.kt")
    public void testWhileComplex() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/whileComplex.kt");
        doTest(fileName);
    }

    @TestMetadata("whileConditionExtracted.kt")
    public void testWhileConditionExtracted() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/inlineEvaluationOrder/cases/whileConditionExtracted.kt");
        doTest(fileName);
    }
}

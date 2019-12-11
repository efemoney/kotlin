/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.ir.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxInline/suspend")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrInlineSuspendTestsGenerated extends AbstractIrInlineSuspendTests {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
    }

    private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
        KotlinTestUtils.runTest0(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.JS_IR, testDataFilePath);
    }

    public void testAllFilesPresentInSuspend() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/suspend"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @TestMetadata("capturedVariables.kt")
    public void testCapturedVariables_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/capturedVariables.kt", "kotlin.coroutines");
    }

    @TestMetadata("crossinlineSuspendLambdaInsideCrossinlineSuspendLambda.kt")
    public void testCrossinlineSuspendLambdaInsideCrossinlineSuspendLambda_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/crossinlineSuspendLambdaInsideCrossinlineSuspendLambda.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineOrdinaryOfCrossinlineSuspend.kt")
    public void testInlineOrdinaryOfCrossinlineSuspend_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineOrdinaryOfCrossinlineSuspend.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineOrdinaryOfNoinlineSuspend.kt")
    public void testInlineOrdinaryOfNoinlineSuspend_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineOrdinaryOfNoinlineSuspend.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineSuspendOfCrossinlineOrdinary.kt")
    public void testInlineSuspendOfCrossinlineOrdinary_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineSuspendOfCrossinlineOrdinary.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineSuspendOfCrossinlineSuspend.kt")
    public void testInlineSuspendOfCrossinlineSuspend_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineSuspendOfCrossinlineSuspend.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineSuspendOfNoinlineOrdinary.kt")
    public void testInlineSuspendOfNoinlineOrdinary_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineSuspendOfNoinlineOrdinary.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineSuspendOfNoinlineSuspend.kt")
    public void testInlineSuspendOfNoinlineSuspend_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineSuspendOfNoinlineSuspend.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineSuspendOfOrdinary.kt")
    public void testInlineSuspendOfOrdinary_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineSuspendOfOrdinary.kt", "kotlin.coroutines");
    }

    @TestMetadata("inlineSuspendOfSuspend.kt")
    public void testInlineSuspendOfSuspend_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/inlineSuspendOfSuspend.kt", "kotlin.coroutines");
    }

    @TestMetadata("kt26658.kt")
    public void testKt26658() throws Exception {
        runTest("compiler/testData/codegen/boxInline/suspend/kt26658.kt");
    }

    @TestMetadata("maxStackWithCrossinline.kt")
    public void testMaxStackWithCrossinline_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/maxStackWithCrossinline.kt", "kotlin.coroutines");
    }

    @TestMetadata("multipleLocals.kt")
    public void testMultipleLocals_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/multipleLocals.kt", "kotlin.coroutines");
    }

    @TestMetadata("multipleSuspensionPoints.kt")
    public void testMultipleSuspensionPoints_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/multipleSuspensionPoints.kt", "kotlin.coroutines");
    }

    @TestMetadata("nonSuspendCrossinline.kt")
    public void testNonSuspendCrossinline_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/nonSuspendCrossinline.kt", "kotlin.coroutines");
    }

    @TestMetadata("returnValue.kt")
    public void testReturnValue_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/returnValue.kt", "kotlin.coroutines");
    }

    @TestMetadata("tryCatchStackTransform.kt")
    public void testTryCatchStackTransform_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/tryCatchStackTransform.kt", "kotlin.coroutines");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/suspend/callableReference")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CallableReference extends AbstractIrInlineSuspendTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInCallableReference() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/suspend/callableReference"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/boxInline/suspend/callableReference/simple.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/suspend/defaultParameter")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultParameter extends AbstractIrInlineSuspendTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
            KotlinTestUtils.runTest0(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultParameter() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/suspend/defaultParameter"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @TestMetadata("defaultValueCrossinline.kt")
        public void testDefaultValueCrossinline_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/defaultParameter/defaultValueCrossinline.kt", "kotlin.coroutines");
        }

        @TestMetadata("defaultValueInlineFromMultiFileFacade.kt")
        public void testDefaultValueInlineFromMultiFileFacade_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/defaultParameter/defaultValueInlineFromMultiFileFacade.kt", "kotlin.coroutines");
        }

        @TestMetadata("defaultValueInline.kt")
        public void testDefaultValueInline_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/defaultParameter/defaultValueInline.kt", "kotlin.coroutines");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/suspend/inlineUsedAsNoinline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineUsedAsNoinline extends AbstractIrInlineSuspendTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInInlineUsedAsNoinline() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/suspend/inlineUsedAsNoinline"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @TestMetadata("inlineOnly.kt")
        public void testInlineOnly() throws Exception {
            runTest("compiler/testData/codegen/boxInline/suspend/inlineUsedAsNoinline/inlineOnly.kt");
        }

        @TestMetadata("simpleNamed.kt")
        public void testSimpleNamed() throws Exception {
            runTest("compiler/testData/codegen/boxInline/suspend/inlineUsedAsNoinline/simpleNamed.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/suspend/receiver")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Receiver extends AbstractIrInlineSuspendTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
            KotlinTestUtils.runTest0(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInReceiver() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/suspend/receiver"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @TestMetadata("inlineOrdinaryOfCrossinlineSuspend.kt")
        public void testInlineOrdinaryOfCrossinlineSuspend_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineOrdinaryOfCrossinlineSuspend.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineOrdinaryOfNoinlineSuspend.kt")
        public void testInlineOrdinaryOfNoinlineSuspend_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineOrdinaryOfNoinlineSuspend.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineSuspendOfCrossinlineOrdinary.kt")
        public void testInlineSuspendOfCrossinlineOrdinary_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineSuspendOfCrossinlineOrdinary.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineSuspendOfCrossinlineSuspend.kt")
        public void testInlineSuspendOfCrossinlineSuspend_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineSuspendOfCrossinlineSuspend.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineSuspendOfNoinlineOrdinary.kt")
        public void testInlineSuspendOfNoinlineOrdinary_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineSuspendOfNoinlineOrdinary.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineSuspendOfNoinlineSuspend.kt")
        public void testInlineSuspendOfNoinlineSuspend_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineSuspendOfNoinlineSuspend.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineSuspendOfOrdinary.kt")
        public void testInlineSuspendOfOrdinary_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineSuspendOfOrdinary.kt", "kotlin.coroutines");
        }

        @TestMetadata("inlineSuspendOfSuspend.kt")
        public void testInlineSuspendOfSuspend_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/receiver/inlineSuspendOfSuspend.kt", "kotlin.coroutines");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/suspend/stateMachine")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class StateMachine extends AbstractIrInlineSuspendTests {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
            KotlinTestUtils.runTest0(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInStateMachine() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/suspend/stateMachine"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
        }

        @TestMetadata("crossingCoroutineBoundaries.kt")
        public void testCrossingCoroutineBoundaries_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/crossingCoroutineBoundaries.kt", "kotlin.coroutines");
        }

        @TestMetadata("independentInline.kt")
        public void testIndependentInline_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/independentInline.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerLambdaInsideLambda.kt")
        public void testInnerLambdaInsideLambda_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerLambdaInsideLambda.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerLambdaWithoutCrossinline.kt")
        public void testInnerLambdaWithoutCrossinline_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerLambdaWithoutCrossinline.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerLambda.kt")
        public void testInnerLambda_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerLambda.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerMadnessCallSite.kt")
        public void testInnerMadnessCallSite_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerMadnessCallSite.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerMadness.kt")
        public void testInnerMadness_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerMadness.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerObjectInsideInnerObject.kt")
        public void testInnerObjectInsideInnerObject_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerObjectInsideInnerObject.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerObjectRetransformation.kt")
        public void testInnerObjectRetransformation_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerObjectRetransformation.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerObjectSeveralFunctions.kt")
        public void testInnerObjectSeveralFunctions_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerObjectSeveralFunctions.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerObjectWithoutCapturingCrossinline.kt")
        public void testInnerObjectWithoutCapturingCrossinline_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerObjectWithoutCapturingCrossinline.kt", "kotlin.coroutines");
        }

        @TestMetadata("innerObject.kt")
        public void testInnerObject_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/innerObject.kt", "kotlin.coroutines");
        }

        @TestMetadata("insideObject.kt")
        public void testInsideObject_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/insideObject.kt", "kotlin.coroutines");
        }

        @TestMetadata("normalInline.kt")
        public void testNormalInline_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/normalInline.kt", "kotlin.coroutines");
        }

        @TestMetadata("numberOfSuspentions.kt")
        public void testNumberOfSuspentions_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/numberOfSuspentions.kt", "kotlin.coroutines");
        }

        @TestMetadata("objectInsideLambdas.kt")
        public void testObjectInsideLambdas_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/objectInsideLambdas.kt", "kotlin.coroutines");
        }

        @TestMetadata("oneInlineTwoCaptures.kt")
        public void testOneInlineTwoCaptures_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/oneInlineTwoCaptures.kt", "kotlin.coroutines");
        }

        @TestMetadata("passLambda.kt")
        public void testPassLambda_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/passLambda.kt", "kotlin.coroutines");
        }

        @TestMetadata("passParameterLambda.kt")
        public void testPassParameterLambda_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/passParameterLambda.kt", "kotlin.coroutines");
        }

        @TestMetadata("passParameter.kt")
        public void testPassParameter_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/passParameter.kt", "kotlin.coroutines");
        }

        @TestMetadata("unreachableSuspendMarker.kt")
        public void testUnreachableSuspendMarker_1_3() throws Exception {
            runTestWithPackageReplacement("compiler/testData/codegen/boxInline/suspend/stateMachine/unreachableSuspendMarker.kt", "kotlin.coroutines");
        }
    }
}

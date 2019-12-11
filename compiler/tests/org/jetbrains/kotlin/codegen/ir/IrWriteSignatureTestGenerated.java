/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.ir;

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
@TestMetadata("compiler/testData/writeSignature")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrWriteSignatureTestGenerated extends AbstractIrWriteSignatureTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
    }

    public void testAllFilesPresentInWriteSignature() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("ArrayOfCharSequence.kt")
    public void testArrayOfCharSequence() throws Exception {
        runTest("compiler/testData/writeSignature/ArrayOfCharSequence.kt");
    }

    @TestMetadata("ArrayOfInt.kt")
    public void testArrayOfInt() throws Exception {
        runTest("compiler/testData/writeSignature/ArrayOfInt.kt");
    }

    @TestMetadata("backingFieldForGenericDelegated.kt")
    public void testBackingFieldForGenericDelegated() throws Exception {
        runTest("compiler/testData/writeSignature/backingFieldForGenericDelegated.kt");
    }

    @TestMetadata("Comparable.kt")
    public void testComparable() throws Exception {
        runTest("compiler/testData/writeSignature/Comparable.kt");
    }

    @TestMetadata("DeepGenericInnerClass.kt")
    public void testDeepGenericInnerClass() throws Exception {
        runTest("compiler/testData/writeSignature/DeepGenericInnerClass.kt");
    }

    @TestMetadata("GenericInnerClass.kt")
    public void testGenericInnerClass() throws Exception {
        runTest("compiler/testData/writeSignature/GenericInnerClass.kt");
    }

    @TestMetadata("GenericInnerClassWithSimpleOuter.kt")
    public void testGenericInnerClassWithSimpleOuter() throws Exception {
        runTest("compiler/testData/writeSignature/GenericInnerClassWithSimpleOuter.kt");
    }

    @TestMetadata("Int.kt")
    public void testInt() throws Exception {
        runTest("compiler/testData/writeSignature/Int.kt");
    }

    @TestMetadata("IntArray.kt")
    public void testIntArray() throws Exception {
        runTest("compiler/testData/writeSignature/IntArray.kt");
    }

    @TestMetadata("IntQ.kt")
    public void testIntQ() throws Exception {
        runTest("compiler/testData/writeSignature/IntQ.kt");
    }

    @TestMetadata("jlString.kt")
    public void testJlString() throws Exception {
        runTest("compiler/testData/writeSignature/jlString.kt");
    }

    @TestMetadata("ListOfCharSequence.kt")
    public void testListOfCharSequence() throws Exception {
        runTest("compiler/testData/writeSignature/ListOfCharSequence.kt");
    }

    @TestMetadata("ListOfStar.kt")
    public void testListOfStar() throws Exception {
        runTest("compiler/testData/writeSignature/ListOfStar.kt");
    }

    @TestMetadata("MapEntry.kt")
    public void testMapEntry() throws Exception {
        runTest("compiler/testData/writeSignature/MapEntry.kt");
    }

    @TestMetadata("MutableMapEntry.kt")
    public void testMutableMapEntry() throws Exception {
        runTest("compiler/testData/writeSignature/MutableMapEntry.kt");
    }

    @TestMetadata("NonGeneric.kt")
    public void testNonGeneric() throws Exception {
        runTest("compiler/testData/writeSignature/NonGeneric.kt");
    }

    @TestMetadata("StarProjectionInClass.kt")
    public void testStarProjectionInClass() throws Exception {
        runTest("compiler/testData/writeSignature/StarProjectionInClass.kt");
    }

    @TestMetadata("StarProjectionInSuper.kt")
    public void testStarProjectionInSuper() throws Exception {
        runTest("compiler/testData/writeSignature/StarProjectionInSuper.kt");
    }

    @TestMetadata("StarProjectionOutsideClass.kt")
    public void testStarProjectionOutsideClass() throws Exception {
        runTest("compiler/testData/writeSignature/StarProjectionOutsideClass.kt");
    }

    @TestMetadata("syntheticAccessorForGeneric.kt")
    public void testSyntheticAccessorForGeneric() throws Exception {
        runTest("compiler/testData/writeSignature/syntheticAccessorForGeneric.kt");
    }

    @TestMetadata("VarargCharSequence.kt")
    public void testVarargCharSequence() throws Exception {
        runTest("compiler/testData/writeSignature/VarargCharSequence.kt");
    }

    @TestMetadata("VarargGeneric.kt")
    public void testVarargGeneric() throws Exception {
        runTest("compiler/testData/writeSignature/VarargGeneric.kt");
    }

    @TestMetadata("compiler/testData/writeSignature/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/annotations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("kArrayClassOfJClass.kt")
        public void testKArrayClassOfJClass() throws Exception {
            runTest("compiler/testData/writeSignature/annotations/kArrayClassOfJClass.kt");
        }

        @TestMetadata("kArrayClassOfKClass.kt")
        public void testKArrayClassOfKClass() throws Exception {
            runTest("compiler/testData/writeSignature/annotations/kArrayClassOfKClass.kt");
        }

        @TestMetadata("kClassBasic.kt")
        public void testKClassBasic() throws Exception {
            runTest("compiler/testData/writeSignature/annotations/kClassBasic.kt");
        }

        @TestMetadata("kClassInt.kt")
        public void testKClassInt() throws Exception {
            runTest("compiler/testData/writeSignature/annotations/kClassInt.kt");
        }

        @TestMetadata("kClassOfKClass.kt")
        public void testKClassOfKClass() throws Exception {
            runTest("compiler/testData/writeSignature/annotations/kClassOfKClass.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/callableReference")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CallableReference extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInCallableReference() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/callableReference"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("constructorReferenceInReturnType.kt")
        public void testConstructorReferenceInReturnType() throws Exception {
            runTest("compiler/testData/writeSignature/callableReference/constructorReferenceInReturnType.kt");
        }

        @TestMetadata("functionReferenceInvoke.kt")
        public void testFunctionReferenceInvoke() throws Exception {
            runTest("compiler/testData/writeSignature/callableReference/functionReferenceInvoke.kt");
        }

        @TestMetadata("propertyReferenceGet.kt")
        public void testPropertyReferenceGet() throws Exception {
            runTest("compiler/testData/writeSignature/callableReference/propertyReferenceGet.kt");
        }

        @TestMetadata("suspendFunctionReference.kt")
        public void testSuspendFunctionReference() throws Exception {
            runTest("compiler/testData/writeSignature/callableReference/suspendFunctionReference.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/constructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constructor extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/constructor"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("Constructor0.kt")
        public void testConstructor0() throws Exception {
            runTest("compiler/testData/writeSignature/constructor/Constructor0.kt");
        }

        @TestMetadata("ConstructorCollectionParameter.kt")
        public void testConstructorCollectionParameter() throws Exception {
            runTest("compiler/testData/writeSignature/constructor/ConstructorCollectionParameter.kt");
        }

        @TestMetadata("ConstructorWithTypeParameter.kt")
        public void testConstructorWithTypeParameter() throws Exception {
            runTest("compiler/testData/writeSignature/constructor/ConstructorWithTypeParameter.kt");
        }

        @TestMetadata("ConstructorWithTypeParameterAndValueParameterP.kt")
        public void testConstructorWithTypeParameterAndValueParameterP() throws Exception {
            runTest("compiler/testData/writeSignature/constructor/ConstructorWithTypeParameterAndValueParameterP.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DeclarationSiteVariance extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInDeclarationSiteVariance() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/declarationSiteVariance"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("FunctionTwoTypeParameters.kt")
        public void testFunctionTwoTypeParameters() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/FunctionTwoTypeParameters.kt");
        }

        @TestMetadata("GenericOverrides.kt")
        public void testGenericOverrides() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/GenericOverrides.kt");
        }

        @TestMetadata("InInInPosition.kt")
        public void testInInInPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/InInInPosition.kt");
        }

        @TestMetadata("InInOutPosition.kt")
        public void testInInOutPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/InInOutPosition.kt");
        }

        @TestMetadata("InOfInInInPosition.kt")
        public void testInOfInInInPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/InOfInInInPosition.kt");
        }

        @TestMetadata("InOfInInOutPosition.kt")
        public void testInOfInInOutPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/InOfInInOutPosition.kt");
        }

        @TestMetadata("InOfOutInInPosition.kt")
        public void testInOfOutInInPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/InOfOutInInPosition.kt");
        }

        @TestMetadata("InOfOutInOutPosition.kt")
        public void testInOfOutInOutPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/InOfOutInOutPosition.kt");
        }

        @TestMetadata("MappedSupertypeWithVariance.kt")
        public void testMappedSupertypeWithVariance() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/MappedSupertypeWithVariance.kt");
        }

        @TestMetadata("OpenMembersReturnType.kt")
        public void testOpenMembersReturnType() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OpenMembersReturnType.kt");
        }

        @TestMetadata("OpenMembersValueParameter.kt")
        public void testOpenMembersValueParameter() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OpenMembersValueParameter.kt");
        }

        @TestMetadata("OutInField.kt")
        public void testOutInField() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutInField.kt");
        }

        @TestMetadata("OutInInPosition.kt")
        public void testOutInInPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutInInPosition.kt");
        }

        @TestMetadata("OutInOutPosition.kt")
        public void testOutInOutPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutInOutPosition.kt");
        }

        @TestMetadata("OutOfInInInPosition.kt")
        public void testOutOfInInInPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfInInInPosition.kt");
        }

        @TestMetadata("OutOfInInOutPosition.kt")
        public void testOutOfInInOutPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfInInOutPosition.kt");
        }

        @TestMetadata("OutOfOutInInPosition.kt")
        public void testOutOfOutInInPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfOutInInPosition.kt");
        }

        @TestMetadata("OutOfOutInOutPosition.kt")
        public void testOutOfOutInOutPosition() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfOutInOutPosition.kt");
        }

        @TestMetadata("PropertyGetterIn.kt")
        public void testPropertyGetterIn() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterIn.kt");
        }

        @TestMetadata("PropertyGetterOut.kt")
        public void testPropertyGetterOut() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterOut.kt");
        }

        @TestMetadata("PropertyGetterTwoParams.kt")
        public void testPropertyGetterTwoParams() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterTwoParams.kt");
        }

        @TestMetadata("PropertySetterIn.kt")
        public void testPropertySetterIn() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/PropertySetterIn.kt");
        }

        @TestMetadata("PropertySetterOut.kt")
        public void testPropertySetterOut() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/PropertySetterOut.kt");
        }

        @TestMetadata("RedundantProjections.kt")
        public void testRedundantProjections() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/RedundantProjections.kt");
        }

        @TestMetadata("SuperClassWithVariance.kt")
        public void testSuperClassWithVariance() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/SuperClassWithVariance.kt");
        }

        @TestMetadata("SuperTraitWithVariance.kt")
        public void testSuperTraitWithVariance() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/SuperTraitWithVariance.kt");
        }

        @TestMetadata("SuperTypeWithVarianceInArguments.kt")
        public void testSuperTypeWithVarianceInArguments() throws Exception {
            runTest("compiler/testData/writeSignature/declarationSiteVariance/SuperTypeWithVarianceInArguments.kt");
        }

        @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class JvmWildcardAnnotations extends AbstractIrWriteSignatureTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInJvmWildcardAnnotations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("onFunction.kt")
            public void testOnFunction() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations/onFunction.kt");
            }

            @TestMetadata("onTypes.kt")
            public void testOnTypes() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations/onTypes.kt");
            }

            @TestMetadata("primitiveTypes.kt")
            public void testPrimitiveTypes() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/jvmWildcardAnnotations/primitiveTypes.kt");
            }
        }

        @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class WildcardOptimization extends AbstractIrWriteSignatureTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
            }

            public void testAllFilesPresentInWildcardOptimization() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("argumentOverridability.kt")
            public void testArgumentOverridability() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/argumentOverridability.kt");
            }

            @TestMetadata("arrays.kt")
            public void testArrays() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/arrays.kt");
            }

            @TestMetadata("complicatedInBounds.kt")
            public void testComplicatedInBounds() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/complicatedInBounds.kt");
            }

            @TestMetadata("deepOut.kt")
            public void testDeepOut() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/deepOut.kt");
            }

            @TestMetadata("fields.kt")
            public void testFields() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/fields.kt");
            }

            @TestMetadata("finalReturnType.kt")
            public void testFinalReturnType() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/finalReturnType.kt");
            }

            @TestMetadata("outIn.kt")
            public void testOutIn() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/outIn.kt");
            }

            @TestMetadata("outInv.kt")
            public void testOutInv() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/outInv.kt");
            }

            @TestMetadata("topLevelIn.kt")
            public void testTopLevelIn() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/topLevelIn.kt");
            }

            @TestMetadata("topLevelInv.kt")
            public void testTopLevelInv() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/topLevelInv.kt");
            }

            @TestMetadata("typeParameter.kt")
            public void testTypeParameter() throws Exception {
                runTest("compiler/testData/writeSignature/declarationSiteVariance/wildcardOptimization/typeParameter.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/writeSignature/defaultImpls")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultImpls extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInDefaultImpls() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/defaultImpls"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("functionTypeParameterClash.kt")
        public void testFunctionTypeParameterClash() throws Exception {
            runTest("compiler/testData/writeSignature/defaultImpls/functionTypeParameterClash.kt");
        }

        @TestMetadata("functionTypeParameterClashWith_I.kt")
        public void testFunctionTypeParameterClashWith_I() throws Exception {
            runTest("compiler/testData/writeSignature/defaultImpls/functionTypeParameterClashWith_I.kt");
        }

        @TestMetadata("propertyTypeParameterClash.kt")
        public void testPropertyTypeParameterClash() throws Exception {
            runTest("compiler/testData/writeSignature/defaultImpls/propertyTypeParameterClash.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/inlineClasses")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineClasses extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInInlineClasses() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/inlineClasses"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("basicInlineClassDeclarationCodegen.kt")
        public void testBasicInlineClassDeclarationCodegen() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/basicInlineClassDeclarationCodegen.kt");
        }

        @TestMetadata("genericInlineClassBasedOnGenericType.kt")
        public void testGenericInlineClassBasedOnGenericType() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/genericInlineClassBasedOnGenericType.kt");
        }

        @TestMetadata("genericMethodInsideClass.kt")
        public void testGenericMethodInsideClass() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/genericMethodInsideClass.kt");
        }

        @TestMetadata("inlineClassAsGenericArgument.kt")
        public void testInlineClassAsGenericArgument() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/inlineClassAsGenericArgument.kt");
        }

        @TestMetadata("inlineClassBasedOnOtherInlineClass.kt")
        public void testInlineClassBasedOnOtherInlineClass() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/inlineClassBasedOnOtherInlineClass.kt");
        }

        @TestMetadata("inlineClassWithComplexSubstitutedType.kt")
        public void testInlineClassWithComplexSubstitutedType() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/inlineClassWithComplexSubstitutedType.kt");
        }

        @TestMetadata("inlineClassesInsideFunctionalTypes.kt")
        public void testInlineClassesInsideFunctionalTypes() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/inlineClassesInsideFunctionalTypes.kt");
        }

        @TestMetadata("nullableInlineClassType.kt")
        public void testNullableInlineClassType() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/nullableInlineClassType.kt");
        }

        @TestMetadata("simpleSignatureWithInlineClassTypesAsPrimitive.kt")
        public void testSimpleSignatureWithInlineClassTypesAsPrimitive() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/simpleSignatureWithInlineClassTypesAsPrimitive.kt");
        }

        @TestMetadata("simpleSignatureWithInlineClassTypesAsReference.kt")
        public void testSimpleSignatureWithInlineClassTypesAsReference() throws Exception {
            runTest("compiler/testData/writeSignature/inlineClasses/simpleSignatureWithInlineClassTypesAsReference.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/java8")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Java8 extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInJava8() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/java8"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("mutableMapRemove.kt")
        public void testMutableMapRemove() throws Exception {
            runTest("compiler/testData/writeSignature/java8/mutableMapRemove.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/nothing")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Nothing extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInNothing() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/nothing"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("nothing.kt")
        public void testNothing() throws Exception {
            runTest("compiler/testData/writeSignature/nothing/nothing.kt");
        }

        @TestMetadata("nullableNothing.kt")
        public void testNullableNothing() throws Exception {
            runTest("compiler/testData/writeSignature/nothing/nullableNothing.kt");
        }
    }

    @TestMetadata("compiler/testData/writeSignature/parameterlessMain")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParameterlessMain extends AbstractIrWriteSignatureTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_IR, testDataFilePath);
        }

        public void testAllFilesPresentInParameterlessMain() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/writeSignature/parameterlessMain"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("arrayWithContravariantStringIsNotMainMethod.kt")
        public void testArrayWithContravariantStringIsNotMainMethod() throws Exception {
            runTest("compiler/testData/writeSignature/parameterlessMain/arrayWithContravariantStringIsNotMainMethod.kt");
        }

        @TestMetadata("impostorMains.kt")
        public void testImpostorMains() throws Exception {
            runTest("compiler/testData/writeSignature/parameterlessMain/impostorMains.kt");
        }

        @TestMetadata("main.kt")
        public void testMain() throws Exception {
            runTest("compiler/testData/writeSignature/parameterlessMain/main.kt");
        }

        @TestMetadata("notJvmMainName.kt")
        public void testNotJvmMainName() throws Exception {
            runTest("compiler/testData/writeSignature/parameterlessMain/notJvmMainName.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/writeSignature/parameterlessMain/simple.kt");
        }
    }
}

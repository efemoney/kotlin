/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.samWithReceiver;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SamWithReceiverTestGenerated extends AbstractSamWithReceiverTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInDiagnostics() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("noParameters.kt")
    public void testNoParameters() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/noParameters.kt");
    }

    @TestMetadata("noReturnType.kt")
    public void testNoReturnType() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/noReturnType.kt");
    }

    @TestMetadata("samConversionNoParameters.kt")
    public void testSamConversionNoParameters() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/samConversionNoParameters.kt");
    }

    @TestMetadata("samConversionSimple.kt")
    public void testSamConversionSimple() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/samConversionSimple.kt");
    }

    @TestMetadata("samConversionSimpleWithoutAnnotation.kt")
    public void testSamConversionSimpleWithoutAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/samConversionSimpleWithoutAnnotation.kt");
    }

    @TestMetadata("samWithAnnotation.kt")
    public void testSamWithAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/samWithAnnotation.kt");
    }

    @TestMetadata("samWithoutAnnotation.kt")
    public void testSamWithoutAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/samWithoutAnnotation.kt");
    }

    @TestMetadata("singleParameter.kt")
    public void testSingleParameter() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/singleParameter.kt");
    }

    @TestMetadata("singleParameterWithoutAnnotation.kt")
    public void testSingleParameterWithoutAnnotation() throws Exception {
        runTest("plugins/sam-with-receiver/sam-with-receiver-cli/testData/diagnostics/singleParameterWithoutAnnotation.kt");
    }
}

/*
 * Copyright 2010-2015 JetBrains s.r.o.
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
@TestMetadata("compiler/testData/codegen/box/classes")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ClassesTestGenerated extends AbstractClassesTest {
    public void testAllFilesPresentInClasses() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/classes"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("boxPrimitiveTypeInClinitOfClassObject.kt")
    public void testBoxPrimitiveTypeInClinitOfClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/boxPrimitiveTypeInClinitOfClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("classNamedAsOldPackageFacade.kt")
    public void testClassNamedAsOldPackageFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classNamedAsOldPackageFacade.kt");
        doTest(fileName);
    }

    @TestMetadata("classObject.kt")
    public void testClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObject.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectAsExtensionReceiver.kt")
    public void testClassObjectAsExtensionReceiver() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectAsExtensionReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectAsStaticInitializer.kt")
    public void testClassObjectAsStaticInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectAsStaticInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectField.kt")
    public void testClassObjectField() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectField.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectInTrait.kt")
    public void testClassObjectInTrait() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectInTrait.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectNotOfEnum.kt")
    public void testClassObjectNotOfEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectNotOfEnum.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectToString.kt")
    public void testClassObjectToString() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectToString.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectWithPrivateGenericMember.kt")
    public void testClassObjectWithPrivateGenericMember() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectWithPrivateGenericMember.kt");
        doTest(fileName);
    }

    @TestMetadata("classObjectsWithParentClasses.kt")
    public void testClassObjectsWithParentClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/classObjectsWithParentClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultObjectSameNamesAsInOuter.kt")
    public void testDefaultObjectSameNamesAsInOuter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/defaultObjectSameNamesAsInOuter.kt");
        doTest(fileName);
    }

    @TestMetadata("delegation2.kt")
    public void testDelegation2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegation2.kt");
        doTest(fileName);
    }

    @TestMetadata("delegation3.kt")
    public void testDelegation3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegation3.kt");
        doTest(fileName);
    }

    @TestMetadata("delegation4.kt")
    public void testDelegation4() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegation4.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationGenericArg.kt")
    public void testDelegationGenericArg() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegationGenericArg.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationGenericArgUpperBound.kt")
    public void testDelegationGenericArgUpperBound() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegationGenericArgUpperBound.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationGenericLongArg.kt")
    public void testDelegationGenericLongArg() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegationGenericLongArg.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationJava.kt")
    public void testDelegationJava() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegationJava.kt");
        doTest(fileName);
    }

    @TestMetadata("delegationMethodsWithArgs.kt")
    public void testDelegationMethodsWithArgs() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/delegationMethodsWithArgs.kt");
        doTest(fileName);
    }

    @TestMetadata("exceptionConstructor.kt")
    public void testExceptionConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/exceptionConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionOnNamedClassObject.kt")
    public void testExtensionOnNamedClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/extensionOnNamedClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("funDelegation.kt")
    public void testFunDelegation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/funDelegation.kt");
        doTest(fileName);
    }

    @TestMetadata("inheritSetAndHashSet.kt")
    public void testInheritSetAndHashSet() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inheritSetAndHashSet.kt");
        doTest(fileName);
    }

    @TestMetadata("inheritance.kt")
    public void testInheritance() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inheritance.kt");
        doTest(fileName);
    }

    @TestMetadata("inheritedInnerClass.kt")
    public void testInheritedInnerClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inheritedInnerClass.kt");
        doTest(fileName);
    }

    @TestMetadata("inheritedMethod.kt")
    public void testInheritedMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inheritedMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("initializerBlock.kt")
    public void testInitializerBlock() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/initializerBlock.kt");
        doTest(fileName);
    }

    @TestMetadata("initializerBlockDImpl.kt")
    public void testInitializerBlockDImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/initializerBlockDImpl.kt");
        doTest(fileName);
    }

    @TestMetadata("innerClass.kt")
    public void testInnerClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/innerClass.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1018.kt")
    public void testKt1018() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1018.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1120.kt")
    public void testKt1120() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1120.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1134.kt")
    public void testKt1134() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1134.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1157.kt")
    public void testKt1157() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1157.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1247.kt")
    public void testKt1247() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1247.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1345.kt")
    public void testKt1345() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1345.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1439.kt")
    public void testKt1439() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1439.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1535.kt")
    public void testKt1535() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1535.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1538.kt")
    public void testKt1538() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1538.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1578.kt")
    public void testKt1578() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1578.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1611.kt")
    public void testKt1611() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1611.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1721.kt")
    public void testKt1721() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1721.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1726.kt")
    public void testKt1726() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1726.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1759.kt")
    public void testKt1759() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1759.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1891.kt")
    public void testKt1891() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1891.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1918.kt")
    public void testKt1918() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1918.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1976.kt")
    public void testKt1976() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1976.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1980.kt")
    public void testKt1980() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt1980.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2224.kt")
    public void testKt2224() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2224.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2288.kt")
    public void testKt2288() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2288.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2384.kt")
    public void testKt2384() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2384.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2390.kt")
    public void testKt2390() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2390.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2391.kt")
    public void testKt2391() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2391.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2395.kt")
    public void testKt2395() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2395.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2417.kt")
    public void testKt2417() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2417.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2477.kt")
    public void testKt2477() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2477.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2480.kt")
    public void testKt2480() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2480.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2482.kt")
    public void testKt2482() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2482.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2485.kt")
    public void testKt2485() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2485.kt");
        doTest(fileName);
    }

    @TestMetadata("kt249.kt")
    public void testKt249() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt249.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2532.kt")
    public void testKt2532() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2532.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2566.kt")
    public void testKt2566() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2566.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2566_2.kt")
    public void testKt2566_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2566_2.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2607.kt")
    public void testKt2607() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2607.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2626.kt")
    public void testKt2626() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2626.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2711.kt")
    public void testKt2711() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2711.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2784.kt")
    public void testKt2784() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt2784.kt");
        doTest(fileName);
    }

    @TestMetadata("kt285.kt")
    public void testKt285() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt285.kt");
        doTest(fileName);
    }

    @TestMetadata("kt3001.kt")
    public void testKt3001() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt3001.kt");
        doTest(fileName);
    }

    @TestMetadata("kt3114.kt")
    public void testKt3114() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt3114.kt");
        doTest(fileName);
    }

    @TestMetadata("kt3414.kt")
    public void testKt3414() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt3414.kt");
        doTest(fileName);
    }

    @TestMetadata("kt343.kt")
    public void testKt343() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt343.kt");
        doTest(fileName);
    }

    @TestMetadata("kt3546.kt")
    public void testKt3546() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt3546.kt");
        doTest(fileName);
    }

    @TestMetadata("kt454.kt")
    public void testKt454() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt454.kt");
        doTest(fileName);
    }

    @TestMetadata("kt48.kt")
    public void testKt48() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt48.kt");
        doTest(fileName);
    }

    @TestMetadata("kt496.kt")
    public void testKt496() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt496.kt");
        doTest(fileName);
    }

    @TestMetadata("kt500.kt")
    public void testKt500() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt500.kt");
        doTest(fileName);
    }

    @TestMetadata("kt501.kt")
    public void testKt501() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt501.kt");
        doTest(fileName);
    }

    @TestMetadata("kt504.kt")
    public void testKt504() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt504.kt");
        doTest(fileName);
    }

    @TestMetadata("kt508.kt")
    public void testKt508() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt508.kt");
        doTest(fileName);
    }

    @TestMetadata("kt5347.kt")
    public void testKt5347() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt5347.kt");
        doTest(fileName);
    }

    @TestMetadata("kt6136.kt")
    public void testKt6136() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt6136.kt");
        doTest(fileName);
    }

    @TestMetadata("kt6816.kt")
    public void testKt6816() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt6816.kt");
        doTest(fileName);
    }

    @TestMetadata("kt707.kt")
    public void testKt707() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt707.kt");
        doTest(fileName);
    }

    @TestMetadata("kt723.kt")
    public void testKt723() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt723.kt");
        doTest(fileName);
    }

    @TestMetadata("kt725.kt")
    public void testKt725() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt725.kt");
        doTest(fileName);
    }

    @TestMetadata("kt8011a.kt")
    public void testKt8011a() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt8011a.kt");
        doTest(fileName);
    }

    @TestMetadata("kt903.kt")
    public void testKt903() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt903.kt");
        doTest(fileName);
    }

    @TestMetadata("kt940.kt")
    public void testKt940() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt940.kt");
        doTest(fileName);
    }

    @TestMetadata("kt9642.kt")
    public void testKt9642() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/kt9642.kt");
        doTest(fileName);
    }

    @TestMetadata("namedClassObject.kt")
    public void testNamedClassObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/namedClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("outerThis.kt")
    public void testOuterThis() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/outerThis.kt");
        doTest(fileName);
    }

    @TestMetadata("overloadBinaryOperator.kt")
    public void testOverloadBinaryOperator() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/overloadBinaryOperator.kt");
        doTest(fileName);
    }

    @TestMetadata("overloadPlusAssign.kt")
    public void testOverloadPlusAssign() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/overloadPlusAssign.kt");
        doTest(fileName);
    }

    @TestMetadata("overloadPlusAssignReturn.kt")
    public void testOverloadPlusAssignReturn() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/overloadPlusAssignReturn.kt");
        doTest(fileName);
    }

    @TestMetadata("overloadPlusToPlusAssign.kt")
    public void testOverloadPlusToPlusAssign() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/overloadPlusToPlusAssign.kt");
        doTest(fileName);
    }

    @TestMetadata("overloadUnaryOperator.kt")
    public void testOverloadUnaryOperator() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/overloadUnaryOperator.kt");
        doTest(fileName);
    }

    @TestMetadata("privateOuterFunctions.kt")
    public void testPrivateOuterFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/privateOuterFunctions.kt");
        doTest(fileName);
    }

    @TestMetadata("privateOuterProperty.kt")
    public void testPrivateOuterProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/privateOuterProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("privateToThis.kt")
    public void testPrivateToThis() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/privateToThis.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyDelegation.kt")
    public void testPropertyDelegation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/propertyDelegation.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyInInitializer.kt")
    public void testPropertyInInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/propertyInInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("rightHandOverride.kt")
    public void testRightHandOverride() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/rightHandOverride.kt");
        doTest(fileName);
    }

    @TestMetadata("selfcreate.kt")
    public void testSelfcreate() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/selfcreate.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleBox.kt")
    public void testSimpleBox() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/simpleBox.kt");
        doTest(fileName);
    }

    @TestMetadata("typedDelegation.kt")
    public void testTypedDelegation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/typedDelegation.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/box/classes/inner")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Inner extends AbstractClassesTest {
        public void testAllFilesPresentInInner() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/classes/inner"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("instantiateInDerived.kt")
        public void testInstantiateInDerived() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inner/instantiateInDerived.kt");
            doTest(fileName);
        }

        @TestMetadata("instantiateInDerivedLabeled.kt")
        public void testInstantiateInDerivedLabeled() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inner/instantiateInDerivedLabeled.kt");
            doTest(fileName);
        }

        @TestMetadata("instantiateInSameClass.kt")
        public void testInstantiateInSameClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inner/instantiateInSameClass.kt");
            doTest(fileName);
        }

        @TestMetadata("kt6708.kt")
        public void testKt6708() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inner/kt6708.kt");
            doTest(fileName);
        }

        @TestMetadata("properOuter.kt")
        public void testProperOuter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inner/properOuter.kt");
            doTest(fileName);
        }

        @TestMetadata("properSuperLinking.kt")
        public void testProperSuperLinking() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/classes/inner/properSuperLinking.kt");
            doTest(fileName);
        }
    }
}

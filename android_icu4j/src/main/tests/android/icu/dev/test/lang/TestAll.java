/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 *******************************************************************************
 * Copyright (C) 1996-2010, International Business Machines Corporation and    *
 * others. All Rights Reserved.                                                *
 *******************************************************************************
 */
package android.icu.dev.test.lang;

import android.icu.dev.test.TestFmwk.TestGroup;
import org.junit.runner.RunWith;
import android.icu.junit.IcuTestGroupRunner;

/**
 * Top level test used to run character property tests.
 */
@RunWith(IcuTestGroupRunner.class)
public class TestAll extends TestGroup {
    public static void main(String[] args) throws Exception {
        new TestAll().run(args);
    }

    public TestAll() {
        super(
              new String[] {
                  "TestCharacter",
                  "TestUScript",
                  "TestUScriptRun",
                  "UnicodeSetTest",
                  "UnicodeSetStringSpanTest"
              },
              "Character and Script Tests");
    }

    public static final String CLASS_TARGET_NAME = "Property";
}

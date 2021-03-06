package org.specnaz.params.impl;

import org.specnaz.TestSettings;
import org.specnaz.impl.TestCaseType;
import org.specnaz.params.TestClosureParams4;
import org.specnaz.utils.TestClosure;

import java.util.List;

public final class ParametrizedPositiveTest4<P1, P2, P3, P4> extends
        AbstractParametrizedPositiveTest {
    private final TestClosureParams4<P1, P2, P3, P4> testBody;

    public ParametrizedPositiveTest4(TestSettings testSettings, String description,
            TestClosureParams4<P1, P2, P3, P4> testBody, TestCaseType testCaseType) {
        super(testSettings, description, testCaseType);
        this.testBody = testBody;
    }

    @Override
    protected TestClosure toTestClosure(List<?> params) {
        return Conversions.toTestClosure4(testBody, params);
    }
}
